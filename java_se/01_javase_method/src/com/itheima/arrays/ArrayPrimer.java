package com.itheima.arrays;

public class ArrayPrimer {
    public static void main(String[] args) {
        //基础入门
        int arr[] = new int[]{12,34,56,78};
        int[] age = new int[]{1,2,3,4,5};
        double[] core = {12,54,76};

        System.out.println(core[2]);
        System.out.println(age[2]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        System.out.println(age.length);
        System.out.println(core.length);
        System.out.println(age.length-1);

        System.out.println("------");

        String[] name =new String[8];
        name[0]="张三";
        System.out.println(name[0]);

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);
        System.out.println(booleans[99]);
    }
}
