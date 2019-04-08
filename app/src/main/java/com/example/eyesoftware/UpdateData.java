package com.example.eyesoftware;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UpdateData extends AppCompatActivity {

    Button btn_update;

    private static final String TAG = "UpdateData";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        mDisplayDate = findViewById(R.id.tv_date);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(UpdateData.this, android.R.style.Theme_DeviceDefault_Dialog, mDateSetListener, year, month, day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.GRAY));
                dialog.show();


            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                //Log.d(TAG, "onDateSet: mm/dd/yyyy: " + month + "/" + dayOfMonth + "/" + year);
                String date = dayOfMonth + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };



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
        Spinner spinner_gender = findViewById(R.id.spinner_gender_1);
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
