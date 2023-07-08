package com.example.kipimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class LabTestActivity extends AppCompatActivity {
    private String[][] packages=
            {
                    {"package 1: Full Body Checkup","","","999"},
                    {"package 2: Blood Glucose Fasting","","","299"},
                    {"package 3: Covid-19 Antibody 1gG","","","899"},
                    {"package 4: Thyroid check","","","499"},
                    {"package 5: Immunity Check","","","699"}


            };
    private String[] package_details = {
            "Blood Glucose Fasting\n"+
            "HBA1c\n"+
            "Kidney Function Test\n"+
            "LDH lactate Dehydrogenase, Serium\n"+
            "Lipid Profile\n"+
            "Liver Function Test\n",
        "Blood Glucose Test\n",
        "COVID 19 Antibody - 1gG\n",
        "Thyroid Profile-Total (T3, T4 & TSH Ultra-sensitive)\n",
        "Complete Hemogram\n"+
            "CRP (C Reactive Protein) Quantitative, Serum\n"+
        "Iron Studies\n"+
        "Kidney Function Test\n"+
        "Vitamin D Total 25 Hydroxy\n"+
        "Liver Function Test\n"+
        "Lipid Profile"
            };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    Button btnGoToCart, btnBack;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);
        btnGoToCart.findViewById(R.id.ButtonLDAddToCart);
        btnBack.findViewById(R.id.buttonLDBack);
        listView.findViewById(R.id.ListviewLT);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestActivity.this,HomeActivity.class));
            }
        });

        list = new ArrayList();
        for (int i=0;i<packages.length;i++){
            item = new HashMap<String,String>();
            item.put("line1",packages[i][0]);
            item.put("line2",packages[i][1]);
            item.put("line3",packages[i][2]);
            item.put("line4",packages[i][3]);
            item.put("line5","Total Cost" + packages[i][4]+"/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_line,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        listView.setAdapter(sa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(LabTestActivity.this,LabTestDetailsActivity.class);
                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][4]);
                startActivity(it);
            }
        });

        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(new LabTestActivity.this,CartLabActivity.class));
                startActivity(new Intent(LabTestActivity.this,CartLabActivity.class));
            }
        });

    }
}