package com.yunbocheng.bridging;

/*给定对应的手机品牌*/
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
