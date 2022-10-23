package com.itheima.circulate.forcycle;

public class WhileDemo1 {
    public static void main(String[] args) {
        //世界最高山峰是珠穆朗玛峰(8848.86米=8848860毫米)，
        // 假如我有一张足够大的纸，它的厚度是0.1毫米。请问，折叠多少次，可以折成珠穆朗玛峰的高度。
        double peakHeight = 8848860;
        double paperHeight = 0.1;
        int count = 0;
        while ( paperHeight < peakHeight){
            paperHeight *= 2;
                    count++;
        }
        System.out.println("折叠的次数：" + count);
        System.out.println("纸张的最终厚度：" + paperHeight);
    }
}
