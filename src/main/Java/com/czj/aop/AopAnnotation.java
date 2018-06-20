package com.czj.aop;

import java.lang.annotation.*;

/**
 * 自定义切入注解
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAnnotation {}
