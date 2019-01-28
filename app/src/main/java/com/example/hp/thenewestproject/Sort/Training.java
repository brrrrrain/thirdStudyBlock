package com.example.hp.thenewestproject.Sort;

import android.support.annotation.NonNull;

public class Training {
    private Integer i;

    public Training(Integer i){
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    @NonNull
    @Override
    public String toString() {
        String str = String.valueOf(getI());
        return str;
    }


    public void multiplication(){
        i = i * 2;
    }
}
