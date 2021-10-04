package com.yunbocheng.duck;


public class WildDuck extends Duck{

    // 构造器，传入FlyBehavor对象

    public WildDuck() {
        flyBehavior = new GoodFly();
    }

    @Override
    public void display() {
        System.out.println("野生鸭");
    }
}
