package com.itheima.methods;

public class MethodExampleThree {
    //数组求最大值返回
    public static void main(String[] args) {
        int age[] = {23,45,67,78};
        int max = Arrays(age);
        System.out.println(max);
    }

    public static int Arrays(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
          if (array[i]>max){
              max = array[i];
          }
        }
        return max;
    }

}
