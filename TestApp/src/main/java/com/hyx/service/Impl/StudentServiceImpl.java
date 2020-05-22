package com.hyx.service.Impl;

import com.hyx.dao.StudentDao;
import com.hyx.entity.Student;
import com.hyx.service.StudentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> findAll() { return studentDao.findAll(); }

    public List<Student> findOne(long id) {
        return studentDao.findOne(id);
    }

    public long insert(Student student) {
        return studentDao.insert(student);
    }

    public boolean updateById(String university,Long l) {
        return studentDao.updateById(university,l);
    }

    public boolean deleteById(long id) {
        return studentDao.deleteById(id);
    }

}
