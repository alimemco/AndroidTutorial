package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Session4Question6 extends AppCompatActivity {

    Button btn1 , btn2 ,btn3 ,btn4 ,btn5 ,btn6 ,btn7 ,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question6);

        btn1 = findViewById(R.id.session4question6btn1);
        btn2 = findViewById(R.id.session4question6btn2);
        btn3 = findViewById(R.id.session4question6btn3);
        btn4 = findViewById(R.id.session4question6btn4);
        btn5 = findViewById(R.id.session4question6btn5);
        btn6 = findViewById(R.id.session4question6btn6);
        btn7 = findViewById(R.id.session4question6btn7);
        btn8 = findViewById(R.id.session4question6btn8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn1,btn5);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn2,btn6);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn3,btn7);
            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn4,btn8);
            }
        });



        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn5,btn1);
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn6,btn2);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn7,btn3);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(btn8,btn4);
            }
        });



    }

    private void validate(Button btnF, Button btnS) {
        String sBtnF = btnF.getText().toString();
        String sBtnS = btnS.getText().toString();

        btnF.setText(sBtnS);
        btnS.setText(sBtnF);
    }

}
