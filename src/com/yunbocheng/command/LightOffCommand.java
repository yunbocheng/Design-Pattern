package com.yunbocheng.command;

public class LightOffCommand implements Command{

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    //这个是撤销方法，应该与执行的操作相反 上边是关这里是开
    @Override
    public void undo() {
        light.on();
    }
}
