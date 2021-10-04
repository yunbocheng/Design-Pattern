package com.yunbocheng.duck;

public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
