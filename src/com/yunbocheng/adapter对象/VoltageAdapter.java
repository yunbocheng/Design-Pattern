package com.yunbocheng.adapter对象;

public class VoltageAdapter implements IVoltage5V{

    private Voltage220V voltage220V; // 关联模式-聚合
    // 通过构造器，传入一个Voltage220V 实例。

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器进行转换");
            dst = src / 44;
        }
        return dst;
    }
}
