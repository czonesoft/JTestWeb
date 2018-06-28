package com.czj.pattern.State;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 状态类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 16:24
 **/
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
