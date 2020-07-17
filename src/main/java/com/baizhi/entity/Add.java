package com.baizhi.entity;

public class Add {
    private String id;
    private String age;

    public Add(String id, String age) {
        this.id = id;
        this.age = age;
    }

    public Add() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Add{" +
                "id='" + id + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
