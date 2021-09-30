package com.yunbocheng.bridging;

public class Phone {

    // 使用聚合的方式像Phone中传递手机的类型
    private Brand brand;

    // 使用构造器将手机类型聚合到手机中

    public Phone(Brand brand) {
        this.brand = brand;
    }

    // 定义手机形为的方式
    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
