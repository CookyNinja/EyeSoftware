package com.example.eyesoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Recommendation extends AppCompatActivity {

    Button btn_save_data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        btn_save_data = findViewById(R.id.btn_save_data);

        btn_save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Recommendation.this , SaveData.class);
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

        Intent intent = new Intent( Recommendation.this , PreSurgeryCal.class);
        startActivity(intent);
        finish();
    }*/

}
