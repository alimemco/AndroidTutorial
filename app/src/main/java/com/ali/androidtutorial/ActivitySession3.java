package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivitySession3 extends AppCompatActivity {

    private static final String TAG = "ActivitySession3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session3);

        int example = 16 ;

        if (example >= 10 && example <=20){

            Log.i(TAG, " قبول ");

        }else if(example > 20 || example < 0 ){
            Log.i(TAG, " خارج از محدوده ");
        }



        int a = 8 ;
        int b = 7 ;

        int area = a * b;
        int env = ( a + b) * 2;

        Log.i(TAG, " مساحت : "+area);
        Log.i(TAG, " محیط : "+env);




        float x = 8.0f ;
        float y = 7.0f ;

        float sum = x + y ;
        float sub = x - y ;
        float hit = x * y ;
        float div = x / y ;

        Log.i(TAG, " جمع : "+sum);
        Log.i(TAG, " تفریق : "+sub);
        Log.i(TAG, " ضرب : "+hit);
        Log.i(TAG, " تقسیم : "+div);
    }
}
