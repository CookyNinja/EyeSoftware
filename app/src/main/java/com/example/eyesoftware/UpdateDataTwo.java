package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class UpdateDataTwo extends AppCompatActivity {

    Button btn_update_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data_two);

        btn_update_2 = findViewById(R.id.btn_update_2);

        btn_update_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UpdateDataTwo.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });


        // Spinner element
        Spinner spinner_gender = findViewById(R.id.spinner_gender_2);

        // Spinner Drop down elements for gender spinner

        List<String> gender_categories = new ArrayList<String>();
        gender_categories.add("Female");
        gender_categories.add("Male");
        gender_categories.add("Others");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter_gender = new ArrayAdapter<>(UpdateDataTwo.this, android.R.layout.simple_spinner_item, gender_categories );

        // Drop down layout style - list view with radio button
        dataAdapter_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner

        spinner_gender.setAdapter(dataAdapter_gender);


    }
}
