package com.baizhi.entity;

public class Add {
    private String id;
    private String name;
    private String salary;

    public Add(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Add() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Add{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
