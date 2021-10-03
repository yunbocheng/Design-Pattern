package com.yunbocheng.soya;


// 抽象类，表示豆浆
public abstract class SoyaMilk {

    // 模板方法，make()，模板方法可以定义为final，不让子类覆盖重写
    public final void make(){
        // 这里我们使用模板方法将这个制作豆浆的流程定义下来
        select();
        if (burden()){
            addIngredients();
        }
        soak();
        beat();
    }

    // 定义选材料的方法
    public void select(){
        System.out.println("第一步：选择好新鲜的黄豆！");
    }

    // 定义添加不同配料的方法，这个定义为抽象的方法，因为添加的配料有多种，需要不同的子类进行覆盖重写
    abstract void addIngredients();

    // 浸泡方法
    public void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡，需要3个小时！");
    }

    // 打碎方法
    public void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎！");
    }

    // 定义一个制作纯豆浆的钩子方法，决定是否添加配料，默认为添加
    boolean burden(){
        return true;
    }
}
