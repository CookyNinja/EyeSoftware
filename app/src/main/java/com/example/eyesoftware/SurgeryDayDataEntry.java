package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurgeryDayDataEntry extends AppCompatActivity {

    Button btn_submit_ref_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surgerydaydataentry);

        btn_submit_ref_no = findViewById(R.id.btn_submit_ref_no);

        btn_submit_ref_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SurgeryDayDataEntry.this, Screen6.class);
                startActivity(intent);
                finish();
            }
        });


    }

    // back to menu bar on pressing back button
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // Do extra stuff here

        Intent intent = new Intent( SurgeryDayDataEntry.this , HomeScreen.class);
        startActivity(intent);
        finish();
    }
}
