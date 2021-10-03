package com.yunbocheng.cinema;

public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    // 构造器

    public HomeTheaterFacade() {
        // 使用方法来获取相应的对象
        this.theaterLight = TheaterLight.getTheaterLight();
        this.popcorn = Popcorn.getPopcorn();
        this.stereo = Stereo.getStereo();
        this.projector = Projector.getProjector();
        this.screen = Screen.getScreen();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分为四步
    // 准备工作
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    // 开始观看
    public void play(){
        dvdPlayer.play();
    }

    // 暂停
    public void pause(){
        dvdPlayer.pause();
    }

    // 结束
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
