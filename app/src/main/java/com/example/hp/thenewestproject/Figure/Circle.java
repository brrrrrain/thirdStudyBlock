package com.example.hp.thenewestproject.Figure;

public class Circle implements FigureWithInterface.Shape {
    private double diametr;

    public double getDiametr() {
        return diametr;
    }

    public Circle(double diametr) {
        this.diametr = diametr;
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
