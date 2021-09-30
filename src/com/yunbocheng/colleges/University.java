package com.yunbocheng.colleges;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

// University就是 Composite，可以管理College
// 这个就是学校类
public class University extends OrganizationComponent{

    // 定义一个集合
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();
    // 构造器
    public University(String name, String des) {
        super(name, des);
    }


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
