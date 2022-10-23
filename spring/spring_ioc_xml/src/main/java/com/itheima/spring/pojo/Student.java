package com.itheima.spring.pojo;

import java.util.Arrays;
import java.util.Map;

public class Student {
    private Integer id;
    private  String sname;
    private  Integer age;
    private String gender;
    private  double core;
    private String hobby[];
    private Map<String,Teacher> teacherMap;
    private Clazz clazz;

    public Student() {
    }

    public Student(Integer id, String sname, Integer age, String gender, double core, Clazz clazz) {
        this.id = id;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.core = core;
        this.clazz = clazz;
    }

    public Student(Integer id, String sname, String gender, double core) {
        this.id = id;
        this.sname = sname;
        this.gender = gender;
        this.core = core;
    }
    public Student(Integer id, String sname, String gender, Integer age) {
        this.id = id;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }


    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", core=" + core +
                ", hobby=" + Arrays.toString(hobby) +
                ", teacherMap=" + teacherMap +
                ", clazz=" + clazz +
                '}';
    }
}
