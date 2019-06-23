package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySession5 extends AppCompatActivity {

    private TextView resultTv ;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9 ,num0 ;
    private Button total , sub , mul , div , equal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session5);

        initViews();
    }

    private void initViews() {

        resultTv = findViewById(R.id.as5TextView);
        num0 = findViewById(R.id.as5Btn0);
    }
}
