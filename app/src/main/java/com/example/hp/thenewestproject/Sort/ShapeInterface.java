package com.example.hp.thenewestproject.Sort;

public class ShapeInterface {

    interface Shape {

        double perimetr();

        double area();
    }


    public class Rectangle implements Shape {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double perimetr() {

            return length * 2 + width * 2;
        }

        @Override
        public double area() {

            return length * width;
        }
    }


    public class Square implements Shape {
        double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double perimetr() {

            return side * 4;
        }

        @Override
        public double area() {

            return side * side;
        }
    }


    public class Circle implements Shape {
        double diametr;

        public Circle(double diametr) {
            this.diametr = diametr;
        }

        @Override
        public double perimetr() {

            return Math.PI * diametr;
        }

        @Override
        public double area() {
            double radius = diametr / 2;

            return Math.PI * radius * radius;
        }
    }
}
