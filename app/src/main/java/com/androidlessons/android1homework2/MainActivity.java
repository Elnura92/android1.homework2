package com.androidlessons.android1homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNum, secondNum, thirdNum;
    private Button btnSum;
    private TextView tvAnswer;

    private int sum = 0;
    private int num1, num2, num3;
    private static final String TAG = "TAG";
    private static final String KEY = "KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();

        sumOfTheNums();

        Log.d(TAG, "onCreate: sum of the numbers is " + sum);
    }


    private void sumOfTheNums() {
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                num3 = Integer.parseInt(thirdNum.getText().toString());
                sum = num1 + num2 + num3;
                tvAnswer.setText("" + sum);

            }
        });


    }

    private void initviews() {
        firstNum = findViewById(R.id.etFirstNum);
        secondNum = findViewById(R.id.etSecondNum);
        thirdNum = findViewById(R.id.etThirdNum);

        btnSum = findViewById(R.id.btnSum);
        tvAnswer = findViewById(R.id.tvAnswer);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: sum of the numbers is " + sum);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: sum of the numbers is " + sum);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: sum of the numbers is " + sum);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: sum of the numbers is " + sum);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: sum of the numbers is " + sum);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: sum of the numbers is " + sum);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY, sum);
        Log.d(TAG, "onSaveInstanceState " + sum);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        sum = savedInstanceState.getInt(KEY);
        tvAnswer.setText("" + sum);
        Log.d(TAG, "onRestoreInstanceState " + sum);
    }
}