package com.yunbocheng.colleges;

import java.util.ArrayList;
import java.util.List;


/*这是是一个院系类*/
public class College extends OrganizationComponent{

    public College(String name, String des) {
        super(name, des);
    }

    // List 中存放的 Department
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponent.add(organizationComponent);
    }

    // 重写remove
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponent.remove(organizationComponent);
    }

    // 重写getName方法
    @Override
    public String getName() {
        return super.getName();
    }

    // 重写getDes()
    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法就是输出University 包含的学院。
    @Override
    protected void print() {
        System.out.println("----------"+getName()+"-----------");
        // 遍历 organizationComponents
        for (OrganizationComponent organizationComponentList : organizationComponentLists) {
            organizationComponentList.print();
        }
    }
}
