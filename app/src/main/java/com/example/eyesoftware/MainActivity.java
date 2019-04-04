package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button surgery_day, post_surgery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surgery_day = findViewById(R.id.btn_surgery_day_entry);
        post_surgery = findViewById(R.id.btn_post_surgery_followup);

        surgery_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Screen5.class);
                startActivity(intent);
                finish();

            }
        });

        post_surgery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Screen7.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
