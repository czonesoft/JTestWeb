package com.czj.controller.base;

import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;


/**
 * @Description:
 */
@ControllerAdvice
@ResponseBody
public class WebExceptionHandle {
    //private static Logger logger = LoggerFactory.getLogger(WebExceptionHandle.class);
    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ServiceResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        //logger.error("参数解析失败", e);
        System.out.println(e);
        return ServiceResponseHandle.failed("could_not_read_json");
    }

    /**
     * 405 - Method Not Allowed
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ServiceResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        //logger.error("不支持当前请求方法", e);
        System.out.println(e);
        return ServiceResponseHandle.failed("request_method_not_supported");
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ServiceResponse handleHttpMediaTypeNotSupportedException(Exception e) {
        //logger.error("不支持当前媒体类型", e);
        System.out.println(e);
        return ServiceResponseHandle.failed("content_type_not_supported");
    }

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ServiceResponse handleException(Exception e) {
        /*if (e instanceof BusinessException){
            return ServiceResponseHandle.failed("BUSINESS_ERROR", e.getMessage());
        }*/

        //logger.error("服务运行异常", e);
        System.out.println(e);
        e.printStackTrace();
        return ServiceResponseHandle.failed("server_error");
    }

    @ExceptionHandler(SQLException.class)
    public ModelAndView handSql(Exception ex){
        //LOG.info("SQL Exception " + ex.getMessage());
        System.out.println(ex);
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", ex.getMessage());
        mv.setViewName("errpage");
        return mv;
    }
}
