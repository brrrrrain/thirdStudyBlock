package com.example.hp.thenewestproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.thenewestproject.Sort.AverageConst;
import com.example.hp.thenewestproject.Sort.ChangeOfString;
import com.example.hp.thenewestproject.Sort.Fibonachi;
import com.example.hp.thenewestproject.Sort.NameString;
import com.example.hp.thenewestproject.Sort.Sort;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private int[] arr = {2, 4, 1, 5, 6, 3};
    private int[] arr1 = {5, 4, 7, 1, 2, 3, 1, 8};
    private final double A = 5;
    private final double B = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvResult = findViewById(R.id.tvResult);
        TextView newText = findViewById(R.id.tvAnotherResult);
        TextView averageResult = findViewById(R.id.averageResult);
        TextView stringResult = findViewById(R.id.stringResult);
        TextView fibonachiResult = findViewById(R.id.fibonachiResult);
        Button btnPrintText = findViewById(R.id.btnId);

        Sort newSort = new Sort();
        AverageConst newAverage = new AverageConst();
        NameString newString = new NameString();
        Fibonachi newFibonachi = new Fibonachi();
        ChangeOfString newChange = new ChangeOfString();


        int[] sortMass = newSort.bubbleSort(arr);
        int[] newSortMass = newSort.choiseSort(arr1);
        double myAverage = newAverage.searchOfAverage(A,B);
        String myString = newString.fullnamestring();
        int[] fibonachiMass = newFibonachi.putFibonachi();
        String myChange = newChange.findNumber();


        tvResult.setText(Arrays.toString(sortMass));
        newText.setText(Arrays.toString(newSortMass));
        averageResult.setText(Double.toString(myAverage));
        stringResult.setText(myString);
        fibonachiResult.setText(Arrays.toString(fibonachiMass));
        newText.setText(myChange);



        newFibonachi.putFibonachi();
        newChange.findNumber();


        btnPrintText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.textByButton), Toast.LENGTH_LONG).show();
            }
        });
    }
}