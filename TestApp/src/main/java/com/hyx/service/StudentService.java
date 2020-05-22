package com.hyx.service;

import com.hyx.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public List<Student> findOne(long id);
    public long insert(Student student);
    public boolean updateById(String university,Long l);
    public boolean deleteById(long id);
}
