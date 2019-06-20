package com.ali.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySession4 extends AppCompatActivity implements View.OnClickListener {

    Button btnOne, btnTwo, btnThree, btnFour , btnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4);

        btnOne = findViewById(R.id.activity_session_btnOne);
        btnTwo= findViewById(R.id.activity_session_btnTwo);
        btnThree = findViewById(R.id.activity_session_btnThree);
        btnFour = findViewById(R.id.activity_session_btnFour);
        btnFive = findViewById(R.id.activity_session_btnFive);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.activity_session_btnOne:
                startActivity(new Intent(ActivitySession4.this,Session4Question1.class));
                break;

            case R.id.activity_session_btnTwo:

                break;

            case R.id.activity_session_btnThree:

                break;
            case R.id.activity_session_btnFour:

                break;

            case R.id.activity_session_btnFive:

                break;



        }

    }
}
