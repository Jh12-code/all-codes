package com.itheima.methods;

public class MethodExampleOne {
    //计算1-n的值并返回
    public static void main(String[] args) {
        System.out.println(ReturnN(100));
        System.out.println("----------");

        System.out.println("1-70的和是："+ReturnN(70));
    }

    public static int ReturnN(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum+=i;
        }
        return sum;
    }
}
