package com.example.eyesoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PreSurgeryCal extends AppCompatActivity {

    Button btn_quick_calc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presurgerycal);

        btn_quick_calc = findViewById(R.id.btn_quick_calc);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Model 1");
        categories.add("Model 2");
        categories.add("Model 3");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(PreSurgeryCal.this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        btn_quick_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PreSurgeryCal.this , Recommendation.class);
                startActivity(intent);
                //finish();
            }
        });

    }

    // back to menu bar on pressing back button
    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        // Do extra stuff here

        Intent intent = new Intent( PreSurgeryCal.this , HomeScreen.class);
        startActivity(intent);
        finish();
    }*/
}
