package com.itheima.circulate.forcycle;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 需求：用户输入月份可以展示该月份的天数。
        // 1、3 、5、 7 、 8、 10、 12月份是 31天
        // 2月份是闰年为29天、非闰年为28天。
        // 4 、6 、9、 11月份 是30天
        int month = 2;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月份有31天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月份有30天！！");
                break;
            case 2:
                System.out.println(month+"月份闰年29天，非闰年为28天！！！");
                break;

        }
    }
}
