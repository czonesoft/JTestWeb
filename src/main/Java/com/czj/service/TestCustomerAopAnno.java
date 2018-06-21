package com.czj.service;

import com.czj.aop.AopAnnotation;
import org.springframework.stereotype.Component;

/**
 * 测试Aop AspectJ @Annotation 自定义切面注解
 */
@Component("testAopAnno")
public class TestCustomerAopAnno {
    @AopAnnotation
    public void show(){
        System.out.println("进入 com.czj.service.TestCustomerAopAnno.show");
    }
}
