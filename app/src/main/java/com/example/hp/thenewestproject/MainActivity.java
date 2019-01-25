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
        i3 = i4;

        i4 = i4*2;
        metod2(i3);

        String str3 = String.valueOf(i3);
        String str4 = String.valueOf(i4);

        Log.d("i3", str3);
        Log.d("i4", str4);



        Training i1 = new Training(5);
        Training i2 = new Training(2);
        i1 = i2;
        i2.multiplication();

        metod(i1);


        String str1 = String.valueOf(i1);
        String str2 = String.valueOf(i2);

        Log.d("first", str1);
        Log.d("second", str2);


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

    public void metod2(int ii){
        ii = ii * 2;
    }

}