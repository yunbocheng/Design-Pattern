package com.yunbocheng.bridging;

/*定义不同的手机类型 折叠手机*/
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    /*调用父类的方法来使用后手机*/
    public void open(){
        // 调用父类打开手机的方法
        super.open();
        System.out.println("=== 折叠式手机 ====");
    }

    public void close(){
        super.close();
        System.out.println("=== 折叠式手机 ====");
    }

    public void call(){
        super.call();
        System.out.println("=== 折叠式手机 ====");
    }
}
