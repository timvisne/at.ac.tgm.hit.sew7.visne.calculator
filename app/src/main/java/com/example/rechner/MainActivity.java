package com.example.rechner;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Das ist die mainactivity-class hier wird die Logik für Android programmiert
 * @version 2023-09-07
 * @author Julian Neuwirth
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toggle(View view) {
        RadioGroup radio = findViewById(R.id.radioGroup);
        int radioID = radio.getCheckedRadioButtonId();


        EditText t1 = findViewById(R.id.num1);
        EditText t2 = findViewById(R.id.num2);
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());



        Log.d("Yay", "Yay");
    }
}