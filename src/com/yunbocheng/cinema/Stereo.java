package com.yunbocheng.cinema;

public class Stereo {

    private static Stereo stereo = new Stereo();

    public static Stereo getStereo() {
        return stereo;
    }

    public void on(){
        System.out.println("Screen on");
    }
    public void off(){
        System.out.println("Screen off");
    }
    public void up(){
        System.out.println("Screen up...");
    }
}
