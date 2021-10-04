package com.yunbocheng.duck;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞翔~~");
    }
}
