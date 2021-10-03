package com.yunbocheng.dynamic;

public class Client {

    public static void main(String[] args) {
        //创建一个目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标对象，创建代理对象，这个方法定义的时候返回的是Object类型，现在需要的是 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // 测试一下代理对象的类型
        // ProxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象。
        System.out.println("ProxyInstance=" + proxyInstance.getClass());

        // 通过代理对象，调用目标对象的方法
        proxyInstance.teach();
    }
}
