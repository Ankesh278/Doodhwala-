package com.example.doodhwala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class Homescreen extends AppCompatActivity {

    CardView vegetablemenu,toystore,beautymenu,electronicmenu,healthitembutton,bookitem,giftstoremenu,stationarymenu;
    CardView bluetokaispolight,nestlespotlight,mamasspolight,kissanspotlight,haldiramspotlight,amulspotlight,natcotrustspotlight,vadilalspotlight,patanjalispotlight;
    ImageView menuopt,petbutton;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    TextView name,email;
    Button logout,logoutoffb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        vegetablemenu=findViewById(R.id.vegetablemenu);
        toystore=findViewById(R.id.toystore);
        menuopt=findViewById(R.id.menuopt);
        petbutton=findViewById(R.id.petbuttton);
        beautymenu=findViewById(R.id.beautymenu);
        electronicmenu=findViewById(R.id.electronicmenu);
        healthitembutton=findViewById(R.id.healthitembutton);
        bookitem=findViewById(R.id.bookitem);
        giftstoremenu=findViewById(R.id.giftstoremenu);
        stationarymenu=findViewById(R.id.stationarymenu);

        bluetokaispolight=findViewById(R.id.bluetokaispolight);
        nestlespotlight=findViewById(R.id.nestlespotlight);
        mamasspolight=findViewById(R.id.mamasspolight);
        kissanspotlight=findViewById(R.id.kissanspotlight);
        haldiramspotlight=findViewById(R.id.haldiramspotlight);
        amulspotlight=findViewById(R.id.amulspotlight);
        natcotrustspotlight=findViewById(R.id.natcotrustspotlight);
        vadilalspotlight=findViewById(R.id.vadilalspotlight);
        patanjalispotlight=findViewById(R.id.patanjalispotlight);

        //brandspotlight on clicklistner

        bluetokaispolight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        nestlespotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        mamasspolight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        kissanspotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        haldiramspotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        amulspotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        bluetokaispolight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        bluetokaispolight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        bluetokaispolight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        natcotrustspotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        vadilalspotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });
        patanjalispotlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, menulisting.class);
                startActivity(intent);
            }
        });




















        //stationary on click listner

        stationarymenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,stationarymenu_Activity.class);
                startActivity(intent);
            }
        });

        //gift store on click listner
        giftstoremenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, GiftStoreActivity.class);
                startActivity(intent);
            }
        });

        //book item on click listner
        bookitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,BookStoreActivity.class);
                startActivity(intent);
            }
        });



        //health menu on click Listner
        healthitembutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this, healthmenu_activity.class);
                startActivity(intent);
            }
        });
        //Electronic menu on click listner
        electronicmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,electronic_menu_Activity.class);
                startActivity(intent);
            }
        });


//        Beauty menu on click listner
        beautymenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,BeautyMenuActivity.class);
                startActivity(intent);
            }
        });



//  pet menu onclick listner
        petbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,petmenuActivity.class);
                startActivity(intent);
            }
        });


        gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc= GoogleSignIn.getClient(this,gso);

        logoutoffb=findViewById(R.id.logoutoffb);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        logout=findViewById(R.id.logout);


        //toystore onclick listner

        toystore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,toystoreActivity.class);
                startActivity(intent);

            }
        });




//        Dairy menu clicklistner


        vegetablemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,DairyMenu.class);
                startActivity(intent);
            }
        });


//        Menu options on click listner

        menuopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Homescreen.this,MenuActivity.class);
                startActivity(intent);
            }
        });


//                Gamil log out button onclicklistner



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor edit=sharedPreferences.edit();
                edit.putBoolean("flag",false);
                edit.apply();

                signout();
            }
        });

//        Facebook log out button clicklistner

        logoutoffb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor edit=sharedPreferences.edit();
                edit.putBoolean("flag",false);
                edit.apply();
                signOutFb();
            }
        });


        GoogleSignInAccount acct=GoogleSignIn.getLastSignedInAccount(this);
        if(acct!=null){
            String person=acct.getDisplayName();
            String emailofperson= acct.getDisplayName();

            name.setText(person);
            email.setText(emailofperson);
        }
    }

    void signout(){

        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete( Task<Void> task) {
                finish();
               Intent intent=new Intent(Homescreen.this,LoginActivity.class);
               startActivity(intent);

            }
        });
    }
    void signOutFb(){
        gsc.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        finish();
                        Intent intent=new Intent(Homescreen.this,LoginActivity.class);
                        startActivity(intent);
                    }
                });
    }
}