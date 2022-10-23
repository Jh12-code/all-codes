package com.itheima.circulate.advanced;

import java.util.Scanner;

public class DeadEach {
    public static void main(String[] args) {
        //需求：系统密码是520，请用户不断的输入密码验证，验证不对输出
        //密码错误，验证成功输出欢迎进入系统，并停止程序。
            int password = 520;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入");
            int password1 = scanner.nextInt();
            if (password1==password){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("密码错误！");
            }
        }
    }
}
