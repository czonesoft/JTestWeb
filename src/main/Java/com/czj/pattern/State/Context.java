package com.czj.pattern.State;/**
 * @Description:
 */

/**
 * @program: JTestWeb
 *
 * @description: 状态模式的切换类
 *
 * @author: 陈震军
 *
 * @create: 2018-06-28 16:26
 **/
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
