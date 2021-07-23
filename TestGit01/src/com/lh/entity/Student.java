package com.lh.entity;

import java.util.Objects;

public class Student {

    String name;
    int age;
    int stuNo;

    public Student(String name, int age, int stuNo) {

        this.name = name;
        this.age = age;
        this.stuNo = stuNo;
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

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && stuNo == student.stuNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, stuNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stuNo=" + stuNo +
                '}';
    }
}
