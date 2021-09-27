package com.yunbocheng.house;

public class ordinaryHouse extends House{

    @Override
    public void ground() {
        System.out.println("给普通房子建造地基");
    }

    @Override
    public void masonry() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void capped() {
        System.out.println("给普通房子封顶");
    }

}

