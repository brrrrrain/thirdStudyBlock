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
import com.example.hp.thenewestproject.Sort.ShapeInterface;
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


    @BindView(R.id.rectPerimetr)
        Button rectPerButton;
    @BindView(R.id.rectArea)
        Button rectAreaButton;
    @BindView(R.id.perimetrResult)
        TextView perimetrAmount;
    @BindView(R.id.areaResult)
        TextView areaAmount;


    @BindView(R.id.perimetrResultSquare)
        TextView perimetrAmountSquare;
    @BindView(R.id.areaResultSquare)
        TextView areaAmountSquare;
    @BindView(R.id.squarePerimetr)
        Button squarePerButton;
    @BindView(R.id.squareArea)
        Button squareAreaButton;

    @BindView(R.id.perimetrResultCircle)
    TextView perimetrAmountCircle;
    @BindView(R.id.areaResultCircle)
    TextView areaAmountCircle;
    @BindView(R.id.circlePerimetr)
    Button circlePerButton;
    @BindView(R.id.circleArea)
    Button circleAreaButton;


    ShapeInterface outputRect = new ShapeInterface();
    ShapeInterface.Rectangle rectShape =
            outputRect. new Rectangle(3,4);

    ShapeInterface outputSquare = new ShapeInterface();
    ShapeInterface.Square squareShape =
            outputSquare. new Square(4);

    ShapeInterface outputCircle = new ShapeInterface();
    ShapeInterface.Circle circleShape =
            outputCircle. new Circle(5);

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

    @OnClick({R.id.btnId, R.id.anotherId, R.id.rectPerimetr, R.id.rectArea,
            R.id.squarePerimetr, R.id.squareArea, R.id.circlePerimetr,
            R.id.circleArea})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnId:
                Toast.makeText(getApplicationContext(), getString(R.string.textByButton), Toast.LENGTH_LONG).show();
                break;
            case R.id.anotherId:
                Toast.makeText(getApplicationContext(), getString(R.string.secondButtonText), Toast.LENGTH_LONG).show();
                break;
            case R.id.rectPerimetr:
                double perimetr = rectShape.perimetr();
                perimetrAmount.setText(Double.toString(perimetr));
                break;
            case R.id.rectArea:
                double area = rectShape.area();
                areaAmount.setText(Double.toString(area));
                break;
            case R.id.squarePerimetr:
                double squarePerimetr = squareShape.perimetr();
                perimetrAmountSquare.setText(Double.toString(squarePerimetr));
                break;
            case R.id.squareArea:
                double squareArea = squareShape.area();
                areaAmountSquare.setText(Double.toString(squareArea));
                break;
            case R.id.circlePerimetr:
                double circlePerimetr = circleShape.perimetr();
                perimetrAmountCircle.setText(Double.toString(circlePerimetr));
                break;
            case R.id.circleArea:
                double circleArea = circleShape.area();
                areaAmountCircle.setText(Double.toString(circleArea));
                break;
        }
    }


}