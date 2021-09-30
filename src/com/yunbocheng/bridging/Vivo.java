package com.yunbocheng.bridging;

/*给定对应的手机品牌*/
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机打开了");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机了");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
