package com.hyx.dao;

import com.hyx.entity.Student;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository("studentDao")
public interface StudentDao {
     List<Student> findAll();
     List<Student> findOne(long id);
     long insert(Student student);
     boolean updateById(String university,long l);
     boolean deleteById(long id);

}
