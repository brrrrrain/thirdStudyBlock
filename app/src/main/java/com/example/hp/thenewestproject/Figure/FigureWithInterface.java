package com.example.hp.thenewestproject.Figure;

/*
  Снова использовал Interface в названиии, но думаю, что здесь
  оно уместно, так как в классе присутствует только интерфейс
  и больше ничего
 */

public class FigureWithInterface {
    interface Shape {

        double perimetr();

        double area();
    }
}
