package com.czj.pattern.State;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 状态模式测试类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 16:26
 **/
public class Test {
    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
