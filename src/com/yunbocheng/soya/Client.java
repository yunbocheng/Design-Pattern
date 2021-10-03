package com.yunbocheng.soya;

public class Client {
    public static void main(String[] args) {
        System.out.println("======制作红豆豆浆======");
        // 创建一杯红豆豆浆对象同时调用制作豆浆的流程方法
        new RedBeanSoyaMile().make();
        System.out.println("======制作黑豆豆浆======");
        // 创建一杯黑豆豆浆对象同时调用制作豆浆的流程方法
        new BlackBeanSoyaMile().make();
        // 此时制作纯豆浆，此时使用钩子方法
        System.out.println("======制作纯豆浆========");
        new PureSoyaMilk().make();
    }
}
