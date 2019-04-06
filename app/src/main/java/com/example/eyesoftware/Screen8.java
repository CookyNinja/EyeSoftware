package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen8 extends AppCompatActivity {

    Button btn_update_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);

        btn_update_2 = findViewById(R.id.btn_update_2);

        btn_update_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Screen8.this, Screen1.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
