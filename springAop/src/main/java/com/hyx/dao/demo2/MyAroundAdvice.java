package com.hyx.dao.demo2;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕通知前。。。。。");
        Object obj = invocation.proceed();//用来执行目标方法
        System.out.println("环绕通知后。。。。。");
        return obj;
    }
}
