package com.yunbocheng.colleges;

public abstract class OrganizationComponent{

    private String name; // 名字
    private String des;  // 说明

    // 这里将方法定义为非抽象，因为叶子节点不需要覆盖重写方法
    protected void add(OrganizationComponent organizationComponent){
        // 默认实现9(为了叶子节点考虑)
        throw  new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现9(为了叶子节点考虑)
        throw  new UnsupportedOperationException();
    }

    // 构造器

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // 打印方法设置为抽象方法，因为叶子类也要进行打印，需要覆盖重写这个方法
    protected abstract void print();

}

