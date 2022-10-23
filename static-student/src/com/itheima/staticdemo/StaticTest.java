package com.itheima.staticdemo;

public class StaticTest {
    private String name;

    public static int getMax(int age1,int age2){
        return age1>age2?age1:age2;
    }
    public void study(){
        System.out.println(name+"正在好好学习");
    }
    public static void main(String[] args) {
        System.out.println( StaticTest.getMax(21,23));
        System.out.println( getMax(25,23));

        StaticTest s=new StaticTest();
        s.name="猪八戒";
        s.study();
    }
}
