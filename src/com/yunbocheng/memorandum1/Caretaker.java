package com.yunbocheng.memorandum1;

import java.util.ArrayList;
import java.util.HashMap;

// 守护者对象，保存游戏角色的状态
public class Caretaker {

    // 如果只对一个角色保存一次游戏状态(使用变量)
    private Memento memento;
    // 如果对一个角色保存多次游戏状态(使用ArrayList集合)
    //private ArrayList<Memento> mementos = new ArrayList<>();

    // 如果多个游戏角色保存多个游戏状态(使用HashMap集合)
    // String代表游戏角色，ArrayList保存一个游戏角色对应的多个游戏状态
    // private HashMap<String,ArrayList<Memento>> map = new HashMap();


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
