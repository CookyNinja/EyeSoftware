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

public class UpdateData extends AppCompatActivity {

    Button btn_update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        btn_update = findViewById(R.id.btn_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdateData.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        // Spinner element
        Spinner spinner_gender = findViewById(R.id.spinner_gender);
        Spinner spinner_lens_model = findViewById(R.id.spinner_lens_model);

        // Spinner Drop down elements for gender spinner

        List<String> gender_categories = new ArrayList<String>();
        gender_categories.add("Female");
        gender_categories.add("Male");
        gender_categories.add("Others");

        // Spinner Drop down elements for lens model spinner

        List<String> lens_model_categories = new ArrayList<String>();
        lens_model_categories.add("Model 1");
        lens_model_categories.add("Model 2");
        lens_model_categories.add("Model 3");
        lens_model_categories.add("Others");

        // Creating adapter for spinner
        ArrayAdapter<String>dataAdapter_gender = new ArrayAdapter<>(UpdateData.this, android.R.layout.simple_spinner_item, gender_categories );
        ArrayAdapter<String> dataAdapter_lens_model = new ArrayAdapter<String>(UpdateData.this, android.R.layout.simple_spinner_item, lens_model_categories);

        // Drop down layout style - list view with radio button
        dataAdapter_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_lens_model.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner

        spinner_gender.setAdapter(dataAdapter_gender);
        spinner_lens_model.setAdapter(dataAdapter_lens_model);

    }
}
