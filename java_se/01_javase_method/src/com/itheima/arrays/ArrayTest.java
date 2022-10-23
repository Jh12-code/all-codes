package com.itheima.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //数组元素求最大值
        int[] beautiful = {15,9000,10000,20000,9500,-5};

         int max = beautiful[0];
        for (int i = 0; i < beautiful.length; i++) {
            if (beautiful[i]>max){
            max=beautiful[i];
            }
        }
        System.out.println(max);
    }
}
