package com.czj.pattern.Memento;

import com.czj.pattern.Memento.Memento;

/**
 * 设计模式:行为模式:备忘录模式:原始类
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象。
 */
public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
