package com.yunbocheng.bridging;

public class Client {
    public static void main(String[] args) {

        // 定义一个竖屏类型的Vivo手机
        UpRightPhone upRightPhone = new UpRightPhone(new Vivo());
        // 调用操作手机的方法
        upRightPhone.open();
        upRightPhone.close();
        upRightPhone.call();

        System.out.println("===================================");
        // 定义一个竖屏幕的小米手机
        UpRightPhone upRightPhone1 = new UpRightPhone(new XiaoMi());
        upRightPhone1.open();
        upRightPhone1.close();
        upRightPhone1.call();

        System.out.println("===================================");
        // 定义一个折叠
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        // 调用操作手机的方法
        foldedPhone.open();
        foldedPhone.close();
        foldedPhone.call();
    }
}
