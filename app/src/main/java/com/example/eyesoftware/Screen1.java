package com.example.eyesoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Screen1 extends AppCompatActivity {

    Button btn_pre_surgery_cal,btn_surgery_day_data_entry, btn_post_surgery_follow_up,btn_instructions,  btn_about ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_screen1);

        btn_pre_surgery_cal = findViewById(R.id.btn_pre_surgery_cal);
        btn_surgery_day_data_entry = findViewById(R.id.btn_surgery_day_data_entry);
        btn_post_surgery_follow_up = findViewById(R.id.btn_post_surgery_follow_up);
        btn_instructions = findViewById(R.id.btn_instructions);
        btn_about = findViewById(R.id.btn_about);


        btn_pre_surgery_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen1.this, Screen2.class);
                startActivity(intent);
                finish();
            }
        });

        btn_surgery_day_data_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen1.this, Screen5.class);
                startActivity(intent);
                finish();
            }
        });

        btn_post_surgery_follow_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen1.this, Screen7.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
