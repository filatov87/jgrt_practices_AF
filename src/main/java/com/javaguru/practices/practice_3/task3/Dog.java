package com.javaguru.practices.practice_3.task3;

public class Dog {
    String name;
    String color;
    Integer age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println("Dog is eating");
    };
    void sleep() {
        System.out.println("Dog is sleeping");
    }

}
