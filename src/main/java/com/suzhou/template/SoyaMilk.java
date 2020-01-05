package com.suzhou.template;

public abstract class SoyaMilk {
    public final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }
    public void select(){
        System.out.println("第一步");
    }
    public abstract void addCondiments();
    public void soak(){}
    public void beat(){}
}
