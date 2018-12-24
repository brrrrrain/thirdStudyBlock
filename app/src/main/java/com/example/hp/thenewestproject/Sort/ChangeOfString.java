package com.example.hp.thenewestproject.Sort;

/**
 * Класс, который ищет число в строке и увеличивает его на еденицу
 */

public class ChangeOfString {

    public void findNumber(){
        String  Str = "abc19";
        int  number = Integer.parseInt(Str.replaceAll("[^0-9]", ""));
        int  numberToNewString = number + 1;
        String  NumberString = Integer.toString(numberToNewString);
        String  currentString = Str.replaceAll("[^A-Za-z]","");
        String  finalString = currentString + NumberString;
        System.out.println(finalString);
    }
}
