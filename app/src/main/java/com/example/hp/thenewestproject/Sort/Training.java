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

    @Override
    public String toString() {
        return "Training{" +
                "i=" + i +
                '}';
    }


    public void multiplication(){
        i = i * 2;
    }
}
