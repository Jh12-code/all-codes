package com.itheima.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
       /* 开发一个幸运小游戏，游戏规则如下：
            游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
            未猜中提示：“未命中”，并继续猜测
            猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数据， 最终结束本游戏。*/
        int[] arr = new int[5];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
           arr[i] = r.nextInt(20) + 1;
        }
        Scanner s = new Scanner(System.in);
        OUT:
        while(true){
            System.out.println("请你输入一个1-20之间的整数进行猜测：");
            int guessData = s.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (guessData == arr[i]){
                    System.out.println("恭喜你！运气不错，你猜中的数组是："+arr[i]);
                    break OUT;
                }
            }
            System.out.println("很遗憾：您猜错了！你可以继续猜");
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
