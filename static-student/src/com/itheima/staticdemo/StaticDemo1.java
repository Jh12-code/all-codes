package com.itheima.staticdemo;

public class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println(User.olineNumber);
        User u=new User();
        u.olineNumber++;
        System.out.println(u.olineNumber++);
    }
}
