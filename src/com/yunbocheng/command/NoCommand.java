package com.yunbocheng.command;

/*
* 没有任何的命令 空执行
* 用于初始化每个按钮，对象什么都不做。其实这也是一种设计模式，可以省掉对空判断。
* */
public class NoCommand implements Command{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
