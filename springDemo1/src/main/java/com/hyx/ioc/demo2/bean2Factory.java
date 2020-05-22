package com.hyx.ioc.demo2;

public class bean2Factory {
    public Bean2 createBean2(){
        System.out.println("实例工厂实例化");
        return new Bean2();
    }
}
