package com.javaguru.practices.practice_3.task2;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        double area = radius*radius*3.14;
        return  area;
    }

}