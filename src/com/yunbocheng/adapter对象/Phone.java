package com.yunbocheng.adapter对象;


public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电");
        }else {
            System.out.println("电压小于5V，充电可能较慢");
        }
    }
}
