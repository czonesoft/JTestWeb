package com.czj.controller.base;

/**
 * @Author:陈震军
 * @Description: 服务响应统一数据格式
 */
public class ServiceResponse {
    private String _msg;
    private String _trace;
    public void SetMsg(String msg){
        this._msg = msg;
    }
    public String GetMsg(){
        return  this._msg;
    }
    public void SetTrace(String msg){
        this._trace = msg;
    }
    public String GetTrace(){
        return  this._trace;
    }
}
