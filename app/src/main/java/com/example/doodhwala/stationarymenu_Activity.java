package com.example.doodhwala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class stationarymenu_Activity extends AppCompatActivity {
    ImageView backarrow;
    LinearLayout bookitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationarymenu);
        backarrow=findViewById(R.id.backarrow);
        bookitem=findViewById(R.id.bookitem);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        bookitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(stationarymenu_Activity.this, menulisting.class);
                startActivity(intent);
            }
        });
    }
}