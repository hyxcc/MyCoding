package com.hyx.aspectJ.demo2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


public class MyAspectJXml {
    //前置通知
    public void before(){
        System.out.println("xml方式的前置通知。。。。。。。。" );
    }
    //后置通知
    public void afterReturning(){
        System.out.println("xml方式的后置通知。。。。。。。。");
    }
    //环绕通知
    public Object around(ProceedingJoinPoint proceeding) throws Throwable {
        System.out.println("xml方式的环绕前。。。。。");
        Object obj = proceeding.proceed();//执行目标方法
        System.out.println("xml方式的环绕后。。。。。");
        return obj;
    }
    //异常通知
    public void throwing(Throwable e){
        System.out.println("xml方式的异常抛出异常。。。。。。" + e.getMessage());
    }
    //最终通知
    public void after(){
        System.out.println("xml方式的最终通知。。。。。");
    }

}
