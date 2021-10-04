package com.yunbocheng.duck;

public class PekingDuck extends Duck{

    // 构造器，传入FlyBehavor对象

    public PekingDuck() {
        flyBehavior = new BadFly();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
