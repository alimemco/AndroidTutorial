package com.ali.androidtutorial;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Session4Question3 extends AppCompatActivity {

    private TextView fizTv ,riaTv ,zisTv , sumTv, avTv,maxTv , minTv, resultTv;
    private EditText fizEdTv , riaEdTv , zisEdTv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question3);

        fizTv = findViewById(R.id.session4question3TvFiz);
        riaTv = findViewById(R.id.session4question3TvRia);
        zisTv = findViewById(R.id.session4question3TvZis);
        sumTv = findViewById(R.id.session4question3TvPlus);
        avTv = findViewById(R.id.session4question3TvRes);
        maxTv = findViewById(R.id.session4question3TvMax);
        minTv = findViewById(R.id.session4question3TvMin);
        resultTv = findViewById(R.id.session4question3TvLast);

        fizEdTv = findViewById(R.id.session4question3EdTxFiz);
        riaEdTv = findViewById(R.id.session4question3EdTxRia);
        zisEdTv = findViewById(R.id.session4question3EdTxZis);

        btn = findViewById(R.id.session4question3Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!fizEdTv.getText().toString().equals("") &&
                        !riaEdTv.getText().toString().equals("") &&
                        !zisEdTv.getText().toString().equals("")
                ){

                    int fiz = Integer.parseInt(fizEdTv.getText().toString());
                    int ria = Integer.parseInt(riaEdTv.getText().toString());
                    int zis = Integer.parseInt(zisEdTv.getText().toString());

                    validate(fizTv,fiz);
                    validate(riaTv,ria);
                    validate(zisTv,zis);


                    int sum = fiz + ria + zis ;
                    sumTv.setText(String.valueOf(sum)+" جمع ");

                    int av =  (fiz + ria + zis) /3 ;
                    avTv.setText(String.valueOf(av)+" میانگین ");


                    maxTv.setText(String.valueOf(max(fiz , ria , zis))+" بیشترین نمره ");
                    minTv.setText(String.valueOf(min(fiz , ria , zis))+" کمترین نمره ");


                    if (!(av > 10 )){
                        resultTv.setText("ضعیف");
                    }else {
                        resultTv.setText("");
                    }


                }
            }


        });



    }


    private int max (int... numbers ){

        int max = numbers[0];

        for (int number : numbers) {
            max = Math.max(max, number);
        }

        return max;
    }

    private int min (int... numbers ){

        int min = numbers[0];

        for (int number : numbers) {
            min = Math.min(min, number);
        }

        return min;
    }

    private void validate(TextView tv , int num){
        if (num >= 0 && num <=8){
            tv.setText("مردود");
            tv.setTextColor(Color.parseColor("#f44336"));
        }
        else if (num >= 9 && num <=12){
            tv.setText("نیاز به کمک");
            tv.setTextColor(Color.parseColor("#FF9800"));
        }else if (num >= 13 && num <=20){
            tv.setText("قبول");
            tv.setTextColor(Color.parseColor("#4CAF50"));
        }else {
            tv.setText("نامشخص");
            tv.setTextColor(Color.parseColor("#000000"));
        }
    }
}
