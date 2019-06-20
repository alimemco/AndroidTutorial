package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Session4Question2 extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView areaTv,envTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question2);

        editText = findViewById(R.id.session4question2Ed1);
        btn = findViewById(R.id.session4question2Btn);
        areaTv = findViewById(R.id.session4question2Tv1);
        envTv = findViewById(R.id.session4question2Tv2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() != null ){

                    if (!editText.getText().toString().equals("") ) {
                        int t = Integer.parseInt(editText.getText().toString());

                        float env = (float) ((t*t)*3.14);
                        float area = (float) ((t*2)*3.14);

                        areaTv.setText(String.valueOf(area));
                        envTv.setText(String.valueOf(env));

                    }
                }
            }
        });
    }
}
