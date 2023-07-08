package com.example.kipimo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username"," ").toString();
        Toast.makeText(getApplicationContext(),"welcome "+username,Toast.LENGTH_SHORT).show();

        CardView exit= findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            }
        });
        //LAPTOPS PAGE
        CardView electronics = findViewById(R.id.cardFindDoctoer);
        electronics.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(HomeActivity.this,ElectronicsActivity.class));
                        //startActivity(new Intent(HomeActivity.this,ProductViewActivity.class));

                    }
                });
        CardView labTest = findViewById(R.id.cardlabtest);
        labTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,LabTestActivity.class));
            }
        });

//        CardView orderDetails  = findViewById(R.id.cardOrderDetails);
//        orderDetails.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(HomeActivity.this,OrderDetailsActivity.class);
//            }
//        });

        CardView orderDetails = findViewById(R.id.cardOrderDetails);
        orderDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, OrderDetailsActivity.class));
            }
        });


    }
}