package com.example.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CheckBox cbEnabled = (CheckBox) findViewById(R.id.checkBoxDiscount);
                Boolean cb = cbEnabled.isChecked();

                if(cb == true) {
                    String msg = "The discount is given.";
                    tvShow.setText(msg);
                }

                else {
                    String msg = "The discount is not given";
                    tvShow.setText(msg);
                }
            }
        });

        cbEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

            }
        });





    }
}