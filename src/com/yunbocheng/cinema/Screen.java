package com.yunbocheng.cinema;

public class Screen {

    private static Screen screen = new Screen();

    public static Screen getScreen() {
        return screen;
    }

    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }
}
