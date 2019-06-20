package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Session4Question5 extends AppCompatActivity {

    CheckBox java , python , php , kotlin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question5);

        java = findViewById(R.id.session4question5chbJava);
        python = findViewById(R.id.session4question5chbPython);
        php = findViewById(R.id.session4question5chbPhp);
        kotlin = findViewById(R.id.session4question5chbKotlin);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                python.setChecked(false);
                kotlin.setChecked(false);
                php.setChecked(false);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                java.setChecked(false);
                kotlin.setChecked(false);
                php.setChecked(false);
            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                python.setChecked(false);
                kotlin.setChecked(false);
                java.setChecked(false);
            }
        });

        kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                python.setChecked(false);
                java.setChecked(false);
                php.setChecked(false);
            }
        });


    }


}
