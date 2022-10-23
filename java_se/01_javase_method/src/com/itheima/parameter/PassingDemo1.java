package com.itheima.parameter;

public class PassingDemo1 {
    public static void main(String[] args) {
        //用方法输出数组内容【11，22，33，44，55】
        int[] arr = {11,22,33,44,55};
        ArraysPassing(arr);
    }

    public static void ArraysPassing(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i]+",");
           /* System.out.print(arr[i]+",");*/
        }
        System.out.print("]");
    }

}
