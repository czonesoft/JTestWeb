package com.czj.pattern.Mediator;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 抽象类实现2
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 17:23
 **/
public class User2 extends User{
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
