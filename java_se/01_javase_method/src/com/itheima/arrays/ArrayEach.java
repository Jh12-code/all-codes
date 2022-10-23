package com.itheima.arrays;

public class ArrayEach {
    public static void main(String[] args) {
        int[] age = {10,20,30,40};
        ArrayEa(age);

    }
    public static void ArrayEa(int[] age){
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
