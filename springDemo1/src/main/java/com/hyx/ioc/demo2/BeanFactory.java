package com.hyx.ioc.demo2;

public class BeanFactory {
    public static Bean creatBean2(){
        System.out.println("bean静态实例化");
        return new Bean();
    };
}
