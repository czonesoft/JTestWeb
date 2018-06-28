package com.czj.pattern.Mediator;

/**
 * @program: JTestWeb
 *
 * @description: 中介者模式:中介者接口实现类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 17:18
 **/
public class MyMediator implements Mediator {
    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
