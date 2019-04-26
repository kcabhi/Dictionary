package com.example.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button btnadd,btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnadd =findViewById(R.id.btnAdd);
        btnshow= findViewById(R.id.btnShow);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,AddCountry.class);
                startActivity(intent);
            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents = new Intent(Dashboard.this,CapitalActivity.class);
                startActivity(intents);
            }
        });
    }

}
