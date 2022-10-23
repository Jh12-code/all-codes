package com.itheima.methods;

public class MethodExampleTwo {
    //判断整数是奇数还是偶数
    public static void main(String[] args) {
        PanJiOu(9);


    }

    public static int PanJiOu(int m){
        if ( m % 2 == 0){
            System.out.println("这个数为偶数！！！");
        }
        else {
            System.out.println("为奇数");
        }
        return m;
    }

}
