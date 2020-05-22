package com.hyx.ioc.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Component配置bean，
 * 括号里value值相当于XML配置里id,如果不指定value属性，默认bean的id是当前类的类名。首字母小写。
 */
@Component("user")
@Scope("prototype")//多例

public class User {
    @Value("张三")
    private String name;
    @Resource(name = "sex")
    private Sex sex;
   public String sayHello(String name){
       return "hello" + name;
   }
}
