package com.yunbocheng.house;

public class Villa extends House{
    @Override
    public void ground() {
        System.out.println("给别墅建造地基");
    }

    @Override
    public void masonry() {
        System.out.println("给别墅砌墙");
    }

    @Override
    public void capped() {
        System.out.println("给别墅封顶");
    }
}
