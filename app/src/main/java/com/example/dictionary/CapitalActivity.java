package com.example.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);


        Bundle bundle =getIntent().getExtras();

        if (bundle!=null){

            String meaning = bundle.getString("meaning");
            textView = findViewById(R.id.tv1);
            textView.setText(meaning);
        }
        else
        {
            Toast.makeText(this,"no Message",Toast.LENGTH_LONG).show();
        }
    }}