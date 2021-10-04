package com.yunbocheng.duck;

public class Client {
    public static void main(String[] args) {

        // 野生鸭飞翔技术很好
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        // 北京鸭飞翔技术还行
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        // 玩具鸭不会飞翔
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
