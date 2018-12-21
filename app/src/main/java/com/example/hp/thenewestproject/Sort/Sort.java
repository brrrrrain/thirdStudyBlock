package com.example.hp.thenewestproject.Sort;

public class Sort {
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }

        return array;
    }

    public int[] choiseSort(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        for (int i = 0; i < array1.length; i++) {
            int index = i;
            int element = array1[i];
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < element) {
                    index = j;
                    element = array1[j];
                }
            }
            if (i != index){
                int temp = array1[i];
                array1[i] = array1[index];
                array1[index] = temp;
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        return array1;
    }
}
