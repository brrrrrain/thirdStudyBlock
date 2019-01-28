package com.example.hp.thenewestproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.thenewestproject.Sort.Sort;
import com.example.hp.thenewestproject.Sort.Training;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private int[] arr = {2, 4, 1, 5, 6, 3};
    private int[] arr1 = {5, 4, 7, 1, 2, 3, 1, 8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvResult = findViewById(R.id.tvResult);
        TextView newText = findViewById(R.id.tvAnotherResult);
        Button btn = findViewById(R.id.btnId);

        Sort newSort = new Sort();
        int[] sortMass = newSort.bubbleSort(arr);
        int[] newSortMass = newSort.choiseSort(arr1);



        int i3 = 5;
        int i4 = 2;

        Log.d("rezult: ", "i3 = " + i3 + " i4 = " + i4);

        i3 = i4;

        Log.d("rezult1: ", "i3 = " + i3 + " i4 = " + i4);

        i4 = i4*2;

        Log.d("rezult2: ", "i3 = " + i3 + " i4 = " + i4);

        metod2(i3);

        Log.d("rezult3: ", "i3 = " + i3 + " i4 = " + i4);



        Training i1 = new Training(5);
        Training i2 = new Training(2);

        Log.d("ObjectRezult: ", "i1 = " + i1 + " i2 = " + i2);

        i1 = i2;

        Log.d("ObjectRezult1: ", "i1 = " + i1 + " i2 = " + i2);

        i2.multiplication();

        Log.d("ObjectRezult2: ", "i1 = " + i1 + " i2 = " + i2);

        metod(i1);

        Log.d("ObjectRezult3: ", "i1 = " + i1 + " i2 = " + i2);


        tvResult.setText(Arrays.toString(sortMass));
        newText.setText(Arrays.toString(newSortMass));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.textByButton), Toast.LENGTH_LONG).show();
            }
        });
    }


    public void metod(Training a){
        a.multiplication();
    }

    public void metod2(int x){
        x *= 2;
    }

}