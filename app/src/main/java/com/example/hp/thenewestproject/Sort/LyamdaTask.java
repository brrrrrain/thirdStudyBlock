package com.example.hp.thenewestproject.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
  Создание и реализация простого лямбда-выражения
 */

public class LyamdaTask  {

    public ArrayList<String> repeatTask(int times, ShowRandomString task){
        ArrayList<String> outputArray = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            outputArray.add(task.print("I love Java"));
        }

        return outputArray;
    }
}




