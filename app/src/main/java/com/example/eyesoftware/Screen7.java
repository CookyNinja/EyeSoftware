package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen7 extends AppCompatActivity {

    Button btn_submit_ref_no_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);

        btn_submit_ref_no_2 = findViewById(R.id.btn_submit_ref_no_2);

        btn_submit_ref_no_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Screen7.this, Screen8.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
