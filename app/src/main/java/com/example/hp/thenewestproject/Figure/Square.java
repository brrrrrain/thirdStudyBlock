package com.example.hp.thenewestproject.Figure;

public class Square implements FigureWithInterface.Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimetr() {
        return getSide() * 4;
    }

    @Override
    public double area() {
        return side * side;
    }
}
