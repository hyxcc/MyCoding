package com.hyx.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectJAnno {
    @Before(value = "execution(* com.hyx.aspectJ.demo1.ProductDao.save(..))")
    //可以在方法中传入JoinPoint对象，用来获得切点信息
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知。。。。。。。。" + joinPoint);
    }
    /**
     * 如果增强的方法有返回值，那么后置通知可以通过returning获得该方法的返回值。returning里面的名字可以随意命名，方法里面的Object类型的参数必须和returning的一样
     */
    @AfterReturning(value = "execution(* com.hyx.aspectJ.demo1.ProductDao.delete(..))",returning = "result")
    public void afterReturning(Object result){
        System.out.println("后置通知。。。。。。。。" + result);
    }
    @Around(value = "execution(* com.hyx.aspectJ.demo1.ProductDao.update(..))")
    public Object around(ProceedingJoinPoint proceeding) throws Throwable {
        System.out.println("环绕前。。。。。");
        Object obj = proceeding.proceed();//执行目标方法
        System.out.println("环绕后。。。。。");
        return obj;
    }
    @AfterThrowing(value = "execution(* com.hyx.aspectJ.demo1.ProductDao.find(..))",throwing = "e")
    public void throwing(Throwable e){
        System.out.println("异常抛出异常。。。。。。" + e.getMessage());
    }
    @After(value = "PonintCut1()")
    public void after(){
        System.out.println("最终通知。。。。。");
    }
    /* 通过Pointcut为切点命名
    ●在每个通知内定义切点,会造成工作量大,不易维护,对于重复的切点，可以使用@Pointcut进行定义
    ●切点方法: private void无参数方法,方法名为切点名
    ●当通知多个切点时,可以使用||进行连接
     */
    @Pointcut(value = "execution(* com.hyx.aspectJ.demo1.ProductDao.find(..))")
    public void PonintCut1(){}
}
