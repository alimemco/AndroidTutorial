package com.ali.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivitySession4 extends AppCompatActivity implements View.OnClickListener {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive ,btnSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4);

        btnOne = findViewById(R.id.activity_session_btnOne);
        btnTwo = findViewById(R.id.activity_session_btnTwo);
        btnThree = findViewById(R.id.activity_session_btnThree);
        btnFour = findViewById(R.id.activity_session_btnFour);
        btnFive = findViewById(R.id.activity_session_btnFive);
        btnSix = findViewById(R.id.activity_session_btnSix);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.activity_session_btnOne:
                startActivity(new Intent(ActivitySession4.this, Session4Question1.class));
                break;

            case R.id.activity_session_btnTwo:
                startActivity(new Intent(ActivitySession4.this, Session4Question2.class));
                break;

            case R.id.activity_session_btnThree:
                startActivity(new Intent(ActivitySession4.this, Session4Question3.class));
                break;

            case R.id.activity_session_btnFour:
                startActivity(new Intent(ActivitySession4.this, Session4Question4.class));
                break;

            case R.id.activity_session_btnFive:
                startActivity(new Intent(ActivitySession4.this, Session4Question5.class));
                break;

                case R.id.activity_session_btnSix:
                startActivity(new Intent(ActivitySession4.this, Session4Question6.class));
                break;


        }

    }
}
