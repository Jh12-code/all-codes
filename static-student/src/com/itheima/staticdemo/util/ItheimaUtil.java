package com.itheima.staticdemo.util;

import java.util.Random;

public class ItheimaUtil {


    public static String createVerifyCode(int n){
        String code="";
        String data="qwertyuioasdfghjklzxcvbnm1234567890";
        Random r =new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code+=data.charAt(index);
        }
       return code;
    }
}
