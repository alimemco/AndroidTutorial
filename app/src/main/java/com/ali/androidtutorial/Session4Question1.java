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
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question1);

        edOne = findViewById(R.id.session4questionEd1);
        edTwo = findViewById(R.id.session4questionEd2);
        btn = findViewById(R.id.session4questionBtn);
        textView = findViewById(R.id.session4questionTv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edOne.getText() != null && edTwo.getText() != null){

                    int t = Integer.parseInt(edOne.getText().toString());
                    int a = Integer.parseInt(edTwo.getText().toString());

                    int res = ( t + a ) * 2 ;

                    textView.setText(String.valueOf(res));
                }


            }
        });
    }
}
