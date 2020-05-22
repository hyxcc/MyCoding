package com.hyx.dao.demo1.impl;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("前置通知。。。。。。");
    }
}
