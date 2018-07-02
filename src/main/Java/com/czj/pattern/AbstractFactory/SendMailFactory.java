package com.czj.pattern.AbstractFactory;

/**
 * @program: JTestWeb
 *
 * @description: 抽象工厂模式:工厂类1
 *
 * @author: 陈震军
 *
 * @create: 2018-06-29 10:18
 **/
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
