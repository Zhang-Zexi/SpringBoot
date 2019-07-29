package com.frame.factoryBean;

public class DoMethod implements DoMethodInter{


    @Override
    public void print() {
        System.out.println("do print");
    }

    @Override
    public String printString() {
        return "heihei";
    }
}
