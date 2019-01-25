package com.example.hp.thenewestproject.Figure;

public class Circle implements Shape {
    private double diametr;

    public Circle(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    @Override
    public double perimetr() {

        return Math.PI * getDiametr();
    }

    @Override
    public double area() {
        double radius = getDiametr() / 2;
        return Math.PI * radius * radius;
    }
}
