package com.czj.pattern.AbstractFactory;

/**
 * @program: JTestWeb
 *
 * @description: 抽象工厂测试类.如果你现在想增加一个功能：
 * 发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，
 * 就OK了，无需去改动现成的代码。
 *
 * @author: 陈震军
 *
 * @create: 2018-06-29 10:17
 **/
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory(); //更换其他功能，只需要修改这句话。
        Sender sender = provider.produce();
        sender.Send();
    }
}
