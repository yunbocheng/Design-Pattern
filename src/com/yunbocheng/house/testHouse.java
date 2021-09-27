package com.yunbocheng.house;

public class testHouse {
    public static void main(String[] args) {
        // 创建一个普通房子类实例对象
        ordinaryHouse ordinaryHouse = new ordinaryHouse();
        // 调用建造房子的方法
        ordinaryHouse.build();

        // 创建一个别墅房子类实例对象
        Villa villa = new Villa();
        villa.build();
    }
}
