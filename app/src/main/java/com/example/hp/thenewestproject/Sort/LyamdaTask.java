package com.example.hp.thenewestproject.Sort;

/**
  Создание и реализация простого лямбда-выражения
 */

public class LyamdaTask  {

    public String[] repeatTask(int times, ShowRandomString task){
        String[] outputArray = new String[times];
        for (int i = 0; i < times; i++) {
            outputArray[i] = task.print("I love Java");
        }

        return outputArray;
    }
}




