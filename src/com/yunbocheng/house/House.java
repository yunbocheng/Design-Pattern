package com.yunbocheng.house;

public abstract class House {
    // 定义建造地基的方法
    public abstract void ground();
    // 定义一个砌墙的方法
    public abstract void masonry();
    // 定义一个封顶的抽象方法
    public abstract void capped();

    // 定义一个建造的方法，包含这几个方法
    public void build(){
        // 在这个方法中调用盖房子的三个步骤方法
        ground();
        masonry();
        capped();
    }
}

