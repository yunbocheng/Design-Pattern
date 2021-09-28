package com.yunbocheng.adapter类;

/*适配器类 将220V的电压转换为5V电压*/
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // 获取220V电压
        int scrV = output220V();
        int dstV = scrV / 44;
        return dstV;
    }
}
