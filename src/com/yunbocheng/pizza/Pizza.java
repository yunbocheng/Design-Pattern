package com.yunbocheng.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza {
    // 构造选择披萨的方法
    public Pizza() {
        // 定义一个披萨对象
        Circuit pizza = null;
        // 定义一个循环，可以让用户输入多个披萨的种类
        while (true){
            // 定义一个披萨的类型
            String type = enter();
            if (type.equals("Bacon")){
                pizza = new Bacon();
                pizza.setName(type);
            }else if(type.equals("fruitPizza")){
                pizza = new fruitPizza();
                pizza.setName(type);
            }else {
                break;
            }
            // 输出披萨的制作信息
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bale();
        }
    }

    // 定义一个方法，动态的获取到用户选择披萨的类型
    public String  enter(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = null;
        try {
            System.out.println("请输入选择的披萨类型(Bacon/fruitPizza)");
            type  = reader.readLine();
            return type;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
