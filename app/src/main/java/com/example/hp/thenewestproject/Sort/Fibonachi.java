package com.example.hp.thenewestproject.Sort;

/**
 * Вывод певрых 15 символов последовательности Фибоначчи
 */

public class Fibonachi {

    public int[] putFibonachi(){
        int firstElement = 0;
        int nextToFirstElement = 1;
        int current = 0;
        int[] array = new int[15];

        array[0] = firstElement;
        array[1] = nextToFirstElement;

        for (int i = 2; i < 15; i++){
                current = firstElement + nextToFirstElement;
                firstElement = nextToFirstElement;
                nextToFirstElement = current;
                array[i] = current;
        }

        return array;
    }
}
