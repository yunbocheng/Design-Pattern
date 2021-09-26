package com.yunbocheng.pizza;

public abstract class Circuit {

    //定义披萨的名字
    private String name;
    // 定义一个准备材料的方法(抽象方法)
    abstract void prepare();

    // 定义烘烤的方法
    public void bake(){
        System.out.println(this.name + "正在烘焙中...");
    }
    // 定义切割的方法
    public void cut(){
        System.out.println(this.name + "正在切割中...");
    }
    // 定义一个打包的方法
    public void bale(){
        System.out.println(this.name + "正在打包中...");
    }

    // 定义一个设置披萨名字的方法

    public void setName(String name) {
        this.name = name;
    }
}

