package com.example.hp.thenewestproject.Sort;

/**
 * Класс, который ищет число в строке и увеличивает его на единицу
 */

public class ChangeOfString {

    public String findNumber(){
        String  str = "abc19";
        int  number = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        int  numberToNewString = number + 1;
        String  numberString = Integer.toString(numberToNewString);
        String  currentString = str.replaceAll("[^A-Za-z]","");
        String  finalString = currentString + numberString;

        return finalString;
    }
}
