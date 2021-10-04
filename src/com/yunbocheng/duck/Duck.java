package com.yunbocheng.duck;

public abstract class Duck {

    // 属性，策略接口(此时只定义了飞翔的策略，如果有多个需要都列举出来)
    FlyBehavior flyBehavior;

    // 定义一个显示鸭子信息的抽象方法
    public abstract void display();

    // 飞翔的方法
    public void fly(){
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
