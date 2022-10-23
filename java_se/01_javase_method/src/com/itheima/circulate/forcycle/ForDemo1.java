package com.itheima.circulate.forcycle;

public class ForDemo1 {
    public static void main(String[] args) {
        //需求：求1-5之间的数据和，并把求和结果在控制台输出。
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;

        }
        System.out.println(sum);;
    }
}
