package com.itheima;

public class People {
    private String name;
    private int age;

    public void queryCourse(){
        System.out.println(name+"在查看课表~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
