package com.czj.pattern.AbstractFactory;

/**
 * @program: JTestWeb
 *
 * @description: 抽象工厂模式:工厂类2
 *
 * @author: 陈震军
 *
 * @create: 2018-06-29 10:20
 **/
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
