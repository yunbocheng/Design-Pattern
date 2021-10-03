package com.yunbocheng.soya;

public class PureSoyaMilk extends SoyaMilk{

    // 添加配料的方法定义为空实现代表什么都不加
    @Override
    void addIngredients() {

    }

    @Override
    boolean burden() {
        return false;
    }
}
