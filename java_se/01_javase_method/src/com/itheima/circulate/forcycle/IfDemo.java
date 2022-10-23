package com.itheima.circulate.forcycle;

import java.util.Random;
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        // 需求：心跳（60 - 100）之间是正常的，否则系统提示进一步检查
        int heart=20;
        if (heart<60||heart>100){
            System.out.println("进一步检查！！！");
        }
        //发红包
        int money=1456;
        if(money>1314){
            System.out.println("发送红包成功！");
        }
        else{
            System.out.println("你没钱了。");
        }

        // 绩效系统： 0-60 C  60-80 B 80-90 A 90-100 A+
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int code = sc.nextInt();
        if (0<=code&&code<60){
            System.out.println("你的成绩为C！");
        }
        else if(60<=code&&code<80){
            System.out.println("你的成绩为B");
        }
        else if (80<=code&&code<90){
            System.out.println("你的成绩为A+");
        }
        else{
            System.out.println("你的成绩有毛病！");
        }
    }
}
