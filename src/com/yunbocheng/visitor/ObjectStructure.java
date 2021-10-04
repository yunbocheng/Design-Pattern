package com.yunbocheng.visitor;

import java.util.ArrayList;
import java.util.List;

// 数据结构，管理很多人(Man,Woman)
public class ObjectStructure {

    // 维护一个集合
    private List<Person> persons = new ArrayList<>();

    // 增加到list
    public void attach(Person person){
        persons.add(person);
    }

    // 移除list
    public void detach(Person person){
        persons.remove(person);
    }

    // 显示测评结果
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}

