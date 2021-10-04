package com.yunbocheng.memorandum1;

public class Client {

    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        // 给定角色的初始战斗力与防御力
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和Boss战斗前的状态：");
        gameRole.display();

        // 把当前状态保存到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.creatMemento());

        System.out.println("和Boss大战~~~");
        //设置大战之后角色的攻击力与防御力
        gameRole.setDef(30);
        gameRole.setVit(30);

        System.out.println("大战之后，剩余的攻击力与防御力：");
        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到大战前");
        // 此时获取的是 Memento对象中存储的攻击力与防御力
        gameRole.recoverGameRoleMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：");
        gameRole.display();
    }
}

