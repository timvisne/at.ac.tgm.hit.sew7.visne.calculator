package com.example.rechner;
/**
 *
 */

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
 * Die Software für die App
 * @version 2024-01-08
 * @author Timur Visne
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radG = findViewById(R.id.radioGroup);
        radG.setEnabled(false);
        for (int i = 0; i < radG.getChildCount(); i++) {
            radG.getChildAt(i).setEnabled(false);
        }

        TextView v = findViewById(R.id.sum);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ((TextView) v).setText("0");
                return true;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        RadioGroup radG = findViewById(R.id.radioGroup);
        radG.setEnabled(true);

        for(int i = 0; i< radG.getChildCount(); i++) {
            radG.getChildAt(i).setEnabled(true);
        }
    }

    public void toggle(View view) {
        RadioGroup radG = findViewById(R.id.radioGroup);
        int radioID = radG.getCheckedRadioButtonId();
        RadioButton radB = findViewById(radioID);
        String choice = radB.getText().toString();

        EditText t1 = findViewById(R.id.num1);
        EditText t2 = findViewById(R.id.num2);
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        double sol = 0;
        switch(choice) {
            case "+":
                sol = n1 + n2; break;
            case "_":
                sol = n1 - n2; break;
            case "*":
                sol = n1 * n2; break;
            case "/":
                sol = (double) n1 / n2; break;
            default:
                Log.d("Error", "Error");
        }

        TextView v2 = findViewById(R.id.sum);
        v2.setText(String.valueOf(sol));

        if(sol < 0) v2.setTextColor(Color.parseColor("#ff0000"));
        else v2.setTextColor(Color.parseColor("#000000"));



        Log.d("Yay", "Yay");
    }
}