package com.example.hp.thenewestproject.Figure;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double perimetr() {
        return getLength() * 2 + getWidth() * 2;
    }

    @Override
    public double area() {
        return length * width;
    }
}
