package com.czj.pattern.AbstractFactory;

/**
 * @program: JTestWeb
 *
 * @description: 抽象工厂模式:功能接口实现类1
 *
 * @author: 陈震军
 *
 * @create: 2018-06-29 09:54
 **/
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
