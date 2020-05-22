package com.hyx.ioc.demo1.impl;

import com.hyx.ioc.demo1.StudentService;

public class StudentServiceImpl implements StudentService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello word" + name);

    }
}
