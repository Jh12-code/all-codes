package com.itheima.overload;

public class OverloadInstanceOne {
    public static void main(String[] args) {
        fire();
        fire("米国");
        fire("米国",7);
    }

    public static void fire(){
        System.out.println("向米国发射了一个导弹");
    }

    public static void fire(String location){
        System.out.println("向"+location+"发射一个导弹");
    }

    public static void fire(String location,int number){
        System.out.println("向"+location+"发射"+number+"个导弹");
    }
}
