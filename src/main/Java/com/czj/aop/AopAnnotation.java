package com.czj.aop;

import java.lang.annotation.*;

/**
 * 自定义切入注解
 */
@Target({ElementType.METHOD}) // 声明可以使用该注解的目标类型
@Retention(RetentionPolicy.RUNTIME) // 声明注解的保留期限
@Documented
public @interface AopAnnotation {
    // 声明注解成员
    boolean value() default false;
}
