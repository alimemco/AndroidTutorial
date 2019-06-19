package com.ali.androidtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    private Button btnLsnFour,btnLsnTwo,btnLsnThree;
    
    private static final String TAG = "MainActivityEx";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLsnTwo = findViewById(R.id.main_activity_btn_lsnTwo);
        btnLsnThree = findViewById(R.id.main_activity_btn_lsnThree);
        btnLsnFour = findViewById(R.id.main_activity_btn_lsnFour);

        btnLsnFour.setOnClickListener(this);
        btnLsnTwo.setOnClickListener(this);
        btnLsnThree.setOnClickListener(this);
        


    }

    @Override
    public void onClick(View view) {
        
        switch (view.getId()){


            case R.id.main_activity_btn_lsnTwo:
                startActivity(new Intent(MainActivity.this, ActivitySession2.class));
                break;


            case R.id.main_activity_btn_lsnThree:
                startActivity(new Intent(MainActivity.this, ActivitySession3.class));
                break;

            case R.id.main_activity_btn_lsnFour:
                Toast.makeText(this, "Four", Toast.LENGTH_SHORT).show();
                break;
        }
        
    }
}
