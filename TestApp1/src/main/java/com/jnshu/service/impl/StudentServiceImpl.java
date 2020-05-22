package com.jnshu.service.impl;

import com.jnshu.dao.StudentDao;
import com.jnshu.entity.Student;
import com.jnshu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;


    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
