package com.example.hp.thenewestproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.thenewestproject.Sort.EnumDirections;
import com.example.hp.thenewestproject.Sort.LyamdaTask;
import com.example.hp.thenewestproject.Sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private int[] arr = {2, 4, 1, 5, 6, 3};
    private int[] arr1 = {5, 4, 7, 1, 2, 3, 1, 8};
    
    @BindView(R.id.btnId)
        Button firstButton;
    @BindView(R.id.anotherId)
        Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvResult = findViewById(R.id.tvResult);
        TextView newText = findViewById(R.id.tvAnotherResult);
        TextView forLyambda = findViewById(R.id.lyambdaTask);


        ButterKnife.bind(this);

        Sort newSort = new Sort();
        int[] sortMass = newSort.bubbleSort(arr);
        int[] newSortMass = newSort.choiseSort(arr1);

        EnumDirections newEnum = new EnumDirections();
        int[] resutedArray = newEnum.changeCoordinates(3,4, EnumDirections.Directions.UP);
        int[] outPutArray = newEnum.fewSteps();


        tvResult.setText(Arrays.toString(resutedArray));
        newText.setText(Arrays.toString(outPutArray));

    }

    @OnClick({R.id.btnId, R.id.anotherId})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnId:
                Toast.makeText(getApplicationContext(), getString(R.string.textByButton), Toast.LENGTH_LONG).show();
                break;
            case R.id.anotherId:
                Toast.makeText(getApplicationContext(), getString(R.string.secondButtonText), Toast.LENGTH_LONG).show();
                break;
        }
    }


}