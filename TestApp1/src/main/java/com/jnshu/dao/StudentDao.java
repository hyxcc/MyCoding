package com.jnshu.dao;

import com.jnshu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("studentDao")
public interface StudentDao {
     List<Student> findAll();

}
