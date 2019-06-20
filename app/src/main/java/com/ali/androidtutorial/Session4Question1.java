package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Session4Question1 extends AppCompatActivity {

    EditText edOne , edTwo;
    Button btn;
    TextView areaTv,envTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question1);

        edOne = findViewById(R.id.session4questionEd1);
        edTwo = findViewById(R.id.session4questionEd2);
        btn = findViewById(R.id.session4questionBtn);
        areaTv = findViewById(R.id.session4questionTv);
        envTv = findViewById(R.id.session4questionTv2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edOne.getText() != null && edTwo.getText() != null){

                    if (!edOne.getText().toString().equals("") && !edTwo.getText().toString().equals("")) {
                        int t = Integer.parseInt(edOne.getText().toString());
                        int a = Integer.parseInt(edTwo.getText().toString());

                        int env = (t + a) * 2;
                        int area = t * a;

                        areaTv.setText(String.valueOf(env));
                        envTv.setText(String.valueOf(area));
                    }
                }


            }
        });
    }
}
