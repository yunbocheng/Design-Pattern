package com.yunbocheng.visitor;

public class Client {
    public static void main(String[] args) {
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        // 成功
        Success success  = new Success();
        objectStructure.display(success);

        // 失败
        Fail fail = new Fail();
        objectStructure.display(fail);

    }
}
