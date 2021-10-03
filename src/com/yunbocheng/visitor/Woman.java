package com.yunbocheng.visitor;


/*
* 说明：
* 这里我们使用到了一个双分派，即首先在客户端程序中，将具体状态作为参数传入到woman中(第一次分派)
*  然后Woman类调用作为参数的”具体方法“中方法getWomanResult，同时将自己(this)作为参数传入，完成第二次的分派。
* */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
