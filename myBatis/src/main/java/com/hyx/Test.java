package com.hyx;

import com.hyx.dao.StudentMapper;
import com.hyx.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis.xml");
        SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(is);
        SqlSession session=  sessionFactory.openSession();
        //第二种方式 Mapper接口
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> list = studentMapper.studentAll();
        for(Student s:list){
            System.out.println(s);
        }
        session.close();
    }
}
