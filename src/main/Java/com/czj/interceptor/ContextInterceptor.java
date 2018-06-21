package com.czj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:上下文拦截器
 */
public class ContextInterceptor implements HandlerInterceptor {
    /**
     * @Description: 预处理
     */
    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception{
        System.out.println("拦截MVC请求：preHandle");
        return true;
    }

    @Override
    public void afterCompletion (HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception{
        System.out.println("拦截MVC请求：afterCompletion");
    }
}
