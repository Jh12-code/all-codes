package com.itheima.overload;

public class ParamDemo {
    public static void main(String[] args) {
        int[] array = {13,14,45,35};
        change(array);
        System.out.println(array[1]);
    }
    public static void change(int[] array){
        System.out.println(array[1]);
        array[1] = 222;
        System.out.println(array[1]);
    }
}
