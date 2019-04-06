package com.example.eyesoftware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }

    // back to menu bar on pressing back button
    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        // Do extra stuff here

        Intent intent = new Intent( Instructions.this , HomeScreen.class);
        startActivity(intent);
        finish();
    }*/
}
