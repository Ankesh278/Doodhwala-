package com.example.doodhwala;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class toystoreActivity extends AppCompatActivity {
    ImageView learningandeducation;
    ImageView backarrow;
    TextView centyToysid;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toystore);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        learningandeducation=findViewById(R.id.learningandeducation);
        backarrow=findViewById(R.id.backarrow);

        centyToysid=findViewById(R.id.centyToysid);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        learningandeducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(toystoreActivity.this,menulisting.class);
                startActivity(intent);
            }
        });


        //centy toys onclicklistner
        centyToysid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(toystoreActivity.this,CheckoutActivity.class);
                startActivity(intent);

            }
        });
    }
}