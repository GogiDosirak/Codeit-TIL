package org.example.chapter03.pr5;

public class Circle implements Shape{
    double radius;

    @Override
    public double getArea(double x) {
        return radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
