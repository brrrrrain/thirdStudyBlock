package com.example.hp.thenewestproject.Sort;

/**
  Создание и реализация простого лямбда-выражения
 */

public class LyamdaTask  {

    public void repeatTask(int times, Runnable task){
        for (int i = 0; i < times; i++) {
            task.run();
        }
    }
}




