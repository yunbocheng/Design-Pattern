package com.yunbocheng.sheep;

/**
 *  让这个类实现 Cloneable接口，这样就可以使用Object中的clone()方法来克隆属性相同的对象。
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep friend;
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*覆盖重写clone() 克隆的方法 这里使用默认的克隆方式*/

    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


