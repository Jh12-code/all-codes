package com.itheima;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("蜘蛛精");
        s.setAge(999);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();
    }
}
