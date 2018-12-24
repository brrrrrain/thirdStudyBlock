package com.example.hp.thenewestproject.Sort;

/**
 * Вывод певрых 15 символов последовательности Фибоначчи
 */

public class Fibonachi {

    public void putFibonachi(){
        int firstelement = 0;
        int nexttofirstelement = 1;
        int current = 0;

        System.out.println(firstelement);
        System.out.println(nexttofirstelement);

        for (int i = 1; i < 14; i++){
            current = firstelement + nexttofirstelement;
            firstelement = nexttofirstelement;
            nexttofirstelement = current;
            System.out.println(current);
        }
        System.out.println();
    }
}
