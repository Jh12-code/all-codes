package com.itheima.spring.pojo;

public class Teacher {
    private Integer tid;
    private String tName;

    public Teacher() {
    }

    public Teacher(Integer tid, String tName) {
        this.tid = tid;
        this.tName = tName;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                '}';
    }
}
