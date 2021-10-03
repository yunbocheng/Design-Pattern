package com.yunbocheng.cinema;

public class Projector {
    private static Projector projector = new Projector();

    public static Projector getProjector(){
        return projector;
    }

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void focus(){
        System.out.println("Projector is Projector");
    }
}
