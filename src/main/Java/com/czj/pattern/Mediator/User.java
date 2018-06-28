package com.czj.pattern.Mediator;

/**
 * @program: JTestWeb
 *
 * @description: 中介者模式:要操作的抽象类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 17:20
 **/
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
