package com.itheima.circulate.forcycle;

public class ForDemo3 {
    public static void main(String[] args) {
        //水仙花数是一个三位数
        //水仙花数的个位、十位、百位的数字立方和等于原数
        int number = 0;
        for (int i = 100; i <1000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i+"是水仙花数");
                number++;
            }
        }
        System.out.println(number);
    }
}
