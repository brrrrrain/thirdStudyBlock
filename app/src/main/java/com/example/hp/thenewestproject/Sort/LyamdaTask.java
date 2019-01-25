package com.example.hp.thenewestproject.Sort;

/**
  Создание и реализация простого лямбда-выражения
 */

public class LyamdaTask  {
    //String newStr = "I love Java!";
    //Runnable myClosure = () -> System.out.println("I love Java");


    public void repeatTask(int times, Runnable task){
        for (int i = 0; i < times; i++) {
            task.run();
        }
    }
}




