package com.itheima.parameter;

public class PassingDemo2 {
    public static void main(String[] args) {
        //设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中不存在该元素则返回 -1。
        int[] arr = {11,22,33,44,55};
        int index = checkIndex(arr, 17);
        System.out.println("你查询的索引是："+index);

        System.out.println("------");
        int index1 = checkIndex(arr, 44);
        System.out.println("你查询的索引是："+index1);
    }

    public static int checkIndex(int arr[],int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data){
                return i;
            }
        }
        return -1;
    }
}
