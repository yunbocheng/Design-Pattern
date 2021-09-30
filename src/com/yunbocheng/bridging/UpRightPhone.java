package com.yunbocheng.bridging;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    // 调用父类的手机的操作方法
    public void open(){
        super.open();
        System.out.println("=== 竖屏手机打开 ===");
    }
    public void close(){
        super.close();
        System.out.println("=== 竖屏手机打开 ===");
    }
    public void call(){
        super.call();
        System.out.println("=== 竖屏手机打开 ===");
    }
}
