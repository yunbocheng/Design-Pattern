package com.yunbocheng.memorandum;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    // 在list中集合中会有很多的备忘录对象
    private List<Memento> mementos = new ArrayList<>();

    // 添加备忘录对象
    public void add(Memento memento){
        mementos.add(memento);
    }

    // 获取到第index个Originator的备忘录对象(即保存状态)
    public Memento get(int index){
        return mementos.get(index);
    }
}
