package com.czj.pattern.Mediator;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 测试类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 17:25
 **/
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
