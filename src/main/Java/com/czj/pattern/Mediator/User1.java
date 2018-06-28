package com.czj.pattern.Mediator;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 抽象类实现1
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 17:22
 **/
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
