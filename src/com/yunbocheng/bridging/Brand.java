package com.yunbocheng.bridging;

/*定义不用手机品牌所实现的功能*/
public interface Brand {
    // 定义一个开机的方式
    void open();

    // 定义一个关机的方式
    void close();

    // 定义一个打电话的方式
    void call();
}

