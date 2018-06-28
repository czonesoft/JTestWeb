package com.czj.pattern.Memento;

/**
 * 设计模式:行为模式:备忘录模式:存储备忘录类
 *
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象。
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
