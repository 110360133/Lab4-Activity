package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    private EditText set_drink;
    private RadioGroup rg1,rg2;
    private Button btn_send ;

    private String sugar ="無糖";
    private String ice_opt ="去冰";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}