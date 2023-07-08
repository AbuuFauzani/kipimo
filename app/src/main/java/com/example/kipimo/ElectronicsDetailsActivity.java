package com.example.kipimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ElectronicsDetailsActivity extends AppCompatActivity {
    private  String [][] product_details1 = {
            {"Doctor Name: Abdul kadri", "Hospital Address: Ikuti", "Exp : 5years", "mobile number: 0123456789", "600" },
            {"Doctor Name: Paul kapufi", "Hospital Address: Iwambi", "Exp : 15years", "mobile number: 0123456789", "900" },
            {"Doctor Name: Mfaume Msasa", "Hospital Address: Igumbilo", "Exp : 8years", "mobile number: 0123456789", "300" },
            {"Doctor Name: Daniel Shimbi", "Hospital Address: Ituta", "Exp : 9years", "mobile number: 0123456789", "800" },
            {"Doctor Name: Kajazi Kibaura", "Hospital Address: Igawilo", "Exp : 6years", "mobile number: 0123456789", "500" },
            {"Doctor Name: Hamadi Iddi", "Hospital Address: Inyala", "Exp : 4years", "mobile number: 0123456789", "800" }

    };

    private  String [][] product_details2 = {
            {"Doctor Name: Furaha Rasheed", "Hospital Address: Iyungas", "Exp : 5years", "mobile number: 0123456789", "200" },
            {"Doctor Name: Charles kongo", "Hospital Address: Iwambi", "Exp : 15years", "mobile number: 0123456789", "300" },
            {"Doctor Name: Danilo george", "Hospital Address: Igumbilo", "Exp : 8years", "mobile number: 0123456789", "700" },
            {"Doctor Name: Daniel Revocacus", "Hospital Address: Ituta", "Exp : 9years", "mobile number: 0123456789", "800" },
            {"Doctor Name: Salum Kajazi", "Hospital Address: Igawilo", "Exp : 6years", "mobile number: 0123456789", "500" },
            {"Doctor Name: Hamadi Juma", "Hospital Address: Inyala", "Exp : 4years", "mobile number: 0123456789", "800" }
    };

    private  String [][] product_details3 = {
            {"Doctor Name: Abdul mpemba", "Hospital Address: Ikuti", "Exp : 5years", "mobile number: 0123456789", "600" },
            {"Doctor Name: Paul charles", "Hospital Address: Iwambi", "Exp : 15years", "mobile number: 0123456789", "900" },
            {"Doctor Name: Mfaume kibaura", "Hospital Address: Igumbilo", "Exp : 8years", "mobile number: 0123456789", "300" },
            {"Doctor Name: Daniel david", "Hospital Address: Ituta", "Exp : 9years", "mobile number: 0123456789", "800" },
            {"Doctor Name: Kajazi salim", "Hospital Address: Igawilo", "Exp : 6years", "mobile number: 0123456789", "500" },
            {"Doctor Name: Hamadi kijeba", "Hospital Address: Inyala", "Exp : 4years", "mobile number: 0123456789", "800" }
    };

    private  String [][] product_details4 = {
            {"Doctor Name: David Kazembe", "Hospital Address: Ikuti", "Exp : 5years", "mobile number: 0123456789", "600" },
            {"Doctor Name: Antony mtaka", "Hospital Address: Iwambi", "Exp : 15years", "mobile number: 0123456789", "900" },
            {"Doctor Name: salehe msasa", "Hospital Address: Igumbilo", "Exp : 8years", "mobile number: 0123456789", "300" },
            {"Doctor Name: Daniel kijazi", "Hospital Address: Ituta", "Exp : 9years", "mobile number: 0123456789", "800" },
            {"Doctor Name: Dulla Kibaura", "Hospital Address: Igawilo", "Exp : 6years", "mobile number: 0123456789", "500" },
            {"Doctor Name: Hamadi Iddi", "Hospital Address: Inyala", "Exp : 4years", "mobile number: 0123456789", "800" }
    };

    private  String [][] product_details5 = {
            {"Doctor Name: Abdul kadri", "Hospital Address: Ikuti", "Exp : 5years", "mobile number: 0123456789", "600" },
            {"Doctor Name: Paul kapufi", "Hospital Address: Iwambi", "Exp : 15years", "mobile number: 0123456789", "900" },
            {"Doctor Name: Mfaume Msasa", "Hospital Address: Igumbilo", "Exp : 8years", "mobile number: 0123456789", "300" },
            {"Doctor Name: Daniel Shimbi", "Hospital Address: Ituta", "Exp : 9years", "mobile number: 0123456789", "800" },
            {"Doctor Name: Kajazi Kibaura", "Hospital Address: Igawilo", "Exp : 6years", "mobile number: 0123456789", "500" },
            {"Doctor Name: Hamadi Iddi", "Hospital Address: Inyala", "Exp : 4years", "mobile number: 0123456789", "800" }
    };
TextView tv;
Button btn;
ArrayList list;
HashMap<String,String>item;
SimpleAdapter sa;

String[][] doctor_details ={ };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics_details);
        tv = findViewById(R.id.textViewLogo6);
        btn = findViewById(R.id.ButtonLDAddToCart);

        Intent it = new Intent();
        String title =it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("family physician")==0)
            doctor_details = product_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = product_details2;
        else

        if (title.compareTo("Dentist")==0)
            doctor_details = product_details3;
        else

        if (title.compareTo("Surgeon")==0)
            doctor_details = product_details4;
        else
            doctor_details = product_details5;


            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElectronicsDetailsActivity.this,ElectronicsActivity.class));
            }
        });

            list = new ArrayList();
            for (int i=0; i <doctor_details.length; i++){
                item = new HashMap<String,String>();
                item.put("line1", doctor_details[i][0]);
                item.put("line2", doctor_details[i][1]);
                item.put("line3", doctor_details[i][2]);
                item.put("line4", doctor_details[i][3]);
                item.put("line5","Doc Fees:" +doctor_details[i][4]+ "/-");
                list.add( item );
            }
            sa = new SimpleAdapter(this,list,
                    R.layout.multi_line,
                    new String[]{"line1","line2","line3","line4","line5"},
                    new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                    );
        ListView lst = findViewById(R.id.ListviewLT);
        lst.setAdapter(sa);
//        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent it = new Intent(ElectronicsDetailsActivity.this,BookAppointmentActivity.class);
//                it.putExtra("text1",title);
//                it.putExtra("text2",doctor_details[i][0]);
//                it.putExtra("text3",doctor_details[i][1]);
//                it.putExtra("text4",doctor_details[i][3]);
//                it.putExtra("text5",doctor_details[i][4]);
//                startActivity(it);
//            }
//        });

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(ElectronicsDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);

                // Get the doctor details based on the clicked position
                String[] doctor = doctor_details[position];

                it.putExtra("text2", doctor[0]);
                it.putExtra("text3", doctor[1]);
                it.putExtra("text4", doctor[3]);
                it.putExtra("text5", doctor[4]);
                startActivity(it);
            }
        });



    }
}