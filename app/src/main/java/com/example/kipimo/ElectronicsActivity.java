package com.example.kipimo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElectronicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        CardView exit = findViewById(R.id.cardfDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElectronicsActivity.this,HomeActivity.class));
            }
        });

        CardView FamilyPhisician = findViewById(R.id.cardFDFamilyPhysician);
        FamilyPhisician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent it = new Intent(ElectronicsActivity.this,ElectronicsDetailsActivity.class);
                it.putExtra("title","Electronic Equipment");
                startActivity(it);
            }
        });

        CardView dientician = findViewById(R.id.cardFDdientician);
        dientician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ElectronicsActivity.this,ElectronicsDetailsActivity.class);
                it.putExtra("title","Electronics ");
                startActivity(it);
            }
        });

        CardView dentist = findViewById(R.id.cardFDdentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ElectronicsActivity.this,ElectronicsDetailsActivity.class);
                it.putExtra("title","Dentist" + " ");
                startActivity(it);
    }
});

        CardView surgeon = findViewById(R.id.cardFDSurgen);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ElectronicsActivity.this, ElectronicsDetailsActivity.class);
                it.putExtra("title", "Surgeon");
                startActivity(it);


            }
        });

        CardView cardiologist = findViewById(R.id.cardFDCardiolist);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ElectronicsActivity.this, ElectronicsDetailsActivity.class);
                it.putExtra("title", "Cardiologist");
                startActivity(it);
            }
        });


    }
}