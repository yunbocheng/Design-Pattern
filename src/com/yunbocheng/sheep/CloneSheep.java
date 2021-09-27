package com.yunbocheng.sheep;

public class CloneSheep {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("懒洋洋",20,"白色");
        // 使用clone()方法来克隆出来一只羊
        sheep.friend = new Sheep("沸羊羊",30,"褐色");

        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();

        System.out.println(sheep + " " + sheep.friend.hashCode()); // 地址相同
        System.out.println(sheep1 + " " + sheep1.friend.hashCode()); // 地址相同
        System.out.println(sheep2 + " " + sheep2.friend);
        System.out.println(sheep3 + " " + sheep3.friend);
        System.out.println(sheep4 + " " + sheep4.friend);
        System.out.println(sheep5 + " " + sheep5.friend);

    }
}
