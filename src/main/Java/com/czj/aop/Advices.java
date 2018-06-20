package com.czj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 切面类
 */
@Component
@Aspect
public class Advices{
    //@annotation切点函数
    //要求方法必须被注解com.czj.aop.AopAnnotation才会被织入横切逻辑
    @After("@annotation(com.czj.aop.AopAnnotation)")
    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }
}
