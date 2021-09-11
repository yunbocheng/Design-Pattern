package com.yunbocheng;

public class Test {
    static int a = 0;
    static class Test01{
        static int c = 1;
    }

    public static void main(String[] args) {
        System.out.println(Test.a);
        System.out.println(Test.Test01.c);
    }
}

