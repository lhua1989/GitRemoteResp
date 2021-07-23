package com.lh.entity;

public class Teacher {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "我是一个老师：{" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }
}
