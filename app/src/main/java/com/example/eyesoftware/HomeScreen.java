package com.example.eyesoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button btn_pre_surgery_cal,btn_surgery_day_data_entry, btn_post_surgery_follow_up,btn_instructions,  btn_about ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_homescreen);

        btn_pre_surgery_cal = findViewById(R.id.btn_pre_surgery_cal);
        btn_surgery_day_data_entry = findViewById(R.id.btn_surgery_day_data_entry);
        btn_post_surgery_follow_up = findViewById(R.id.btn_post_surgery_follow_up);
        btn_instructions = findViewById(R.id.btn_instructions);
        btn_about = findViewById(R.id.btn_about);


        btn_pre_surgery_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, PreSurgeryCal.class);
                startActivity(intent);
                finish();
            }
        });

        btn_surgery_day_data_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, SurgeryDayDataEntry.class);
                startActivity(intent);
                finish();
            }
        });

        btn_post_surgery_follow_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, PostSurgeryFollowUp.class);
                startActivity(intent);
                finish();
            }
        });

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, About.class);
                startActivity(intent);
                finish();
            }
        });

        btn_instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Instructions.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
