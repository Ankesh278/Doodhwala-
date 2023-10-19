package com.example.doodhwala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
               Boolean bool= sharedPreferences.getBoolean("flag",false);
               Intent intent;
               if(bool){
                    intent=new Intent(MainActivity.this,Homescreen.class);

               }else {
                    intent=new Intent(MainActivity.this,LoginActivity.class);
               }

                startActivity(intent);
                finish();

            }
        },2000);




    }
}