package com.example.hp.thenewestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hp.thenewestproject.Figure.Circle;
import com.example.hp.thenewestproject.Figure.Rectangle;
import com.example.hp.thenewestproject.Figure.Square;
import com.example.hp.thenewestproject.Sort.Directions;
import com.example.hp.thenewestproject.Sort.EnumDirections;
import com.example.hp.thenewestproject.Sort.LyamdaTask;
import com.example.hp.thenewestproject.Sort.ShowRandomString;
import com.example.hp.thenewestproject.Sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnId)
        Button firstButton;
    @BindView(R.id.anotherId)
        Button secondButton;
    @BindView(R.id.rectPerimetr)
        Button rectPerButton;
    @BindView(R.id.rectArea)
        Button rectAreaButton;
    @BindView(R.id.squarePerimetr)
        Button squarePerButton;
    @BindView(R.id.squareArea)
        Button squareAreaButton;
    @BindView(R.id.circlePerimetr)
        Button circlePerButton;
    @BindView(R.id.circleArea)
        Button circleAreaButton;


    @BindView(R.id.perimetrResult)
        TextView perimetrAmount;
    @BindView(R.id.areaResult)
        TextView areaAmount;


    @BindView(R.id.perimetrResultSquare)
        TextView perimetrAmountSquare;
    @BindView(R.id.areaResultSquare)
        TextView areaAmountSquare;

    @BindView(R.id.perimetrResultCircle)
        TextView perimetrAmountCircle;
    @BindView(R.id.areaResultCircle)
        TextView areaAmountCircle;

    @BindView(R.id.tvResult)
        TextView tvResultOutput;
    @BindView(R.id.tvAnotherResult)
        TextView tvAnothreResultOutput;


    private int[] arr = {2, 4, 1, 5, 6, 3};
    private int[] arr1 = {5, 4, 7, 1, 2, 3, 1, 8};

    Rectangle newRectangle = new Rectangle(3,4);
    Square newSquare = new Square(4);
    Circle newCircle = new Circle(5);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Sort newSort = new Sort();
        int[] sortMass = newSort.bubbleSort(arr);
        int[] newSortMass = newSort.choiseSort(arr1);

        EnumDirections newEnum = new EnumDirections();
        int[] resutedArray = newEnum.changeCoordinates(3,4, Directions.UP);
        int[] outPutArray = newEnum.fewSteps();

        LyamdaTask newLyambda = new LyamdaTask();
        ShowRandomString myClosure = str -> str;
        ArrayList<String> newArray = new ArrayList<String>();
        newArray = newLyambda.repeatTask(10, myClosure);

        ListView stringShowList = (ListView) findViewById(R.id.arrayList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, newArray);

        stringShowList.setAdapter(adapter);

        Button btnAbout = findViewById(R.id.outputStringShow);
        btnAbout.setOnClickListener(
                view -> Toast.makeText(getApplicationContext(),
                        getString(R.string.btnStringAbout),
                        Toast.LENGTH_LONG).show()
        );


        tvResultOutput.setText(Arrays.toString(resutedArray));
        tvAnothreResultOutput.setText(Arrays.toString(outPutArray));

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
                double perimetr = newRectangle.perimetr();
                perimetrAmount.setText(Double.toString(perimetr));
                break;
            case R.id.rectArea:
                double area = newRectangle.area();
                areaAmount.setText(Double.toString(area));
                break;
            case R.id.squarePerimetr:
                double squarePerimetr = newSquare.perimetr();
                perimetrAmountSquare.setText(Double.toString(squarePerimetr));
                break;
            case R.id.squareArea:
                double squareArea = newSquare.area();
                areaAmountSquare.setText(Double.toString(squareArea));
                break;
            case R.id.circlePerimetr:
                double circlePerimetr = newCircle.perimetr();
                perimetrAmountCircle.setText(Double.toString(circlePerimetr));
                break;
            case R.id.circleArea:
                double circleArea = newCircle.area();
                areaAmountCircle.setText(Double.toString(circleArea));
                break;
            default:
                break;
        }
    }


}