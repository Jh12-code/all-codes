package com.itheima.circulate.forcycle;

public class ForDemo2 {
    public static void main(String[] args) {
      //需求：求1-10之间的奇数和，并把求和结果在控制台输出。
        int ji = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2 != 0){
                ji += i;
            }
        }
        System.out.println(ji);
    }
}
