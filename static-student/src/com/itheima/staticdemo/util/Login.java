package com.itheima.staticdemo.util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        String code="";
        String data="qwertyuioasdfghjklzxcvbnm1234567890";
        Random r =new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            code+=data.charAt(index);
        }
        System.out.println("验证码是："+code);
    }
}
