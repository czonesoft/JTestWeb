package com.czj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 切面类
 */
@Component
@Aspect
public class Logger {
    //定义可重用切入点
    @Pointcut(value="execution(* com.czj.aop..*.*(..))")
    public void afterPointcut(){
        System.out.println("----------最终通知----------");
    }

    //后置日志通知
    //@After(value = "afterPointcut()")
    //@annotation切点函数
    //要求方法必须被注解com.czj.aop.AopAnnotation才会被织入横切逻辑
    @After("@annotation(com.czj.aop.AopAnnotation)")
    public void after(JoinPoint jp){
        System.out.println("----------进入切入点 after----------");
    }
}
