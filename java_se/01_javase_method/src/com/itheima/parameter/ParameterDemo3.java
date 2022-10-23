package com.itheima.parameter;

public class ParameterDemo3 {
    public static void main(String[] args) {
        //如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
        int[] arr1 = {11,22,33,44};
        int[] arr2 = {12,23,34,45};
        System.out.println(equalArrays(arr1, arr2));

        int[] arr3 = {11,22,33,44};
        int[] arr4 = {11,22,33,44};
        System.out.println(equalArrays(arr3, arr4));

    }
    public static boolean equalArrays(int arr1[],int arr2[]){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
