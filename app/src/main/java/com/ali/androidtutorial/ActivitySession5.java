package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;

public class ActivitySession5 extends AppCompatActivity implements View.OnClickListener {

    TextView resultTv , indicatorTv;
    Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    Button total, sub, mul, div, clear , equal;

    String txt = "";
    String indicatorMsg = "";

    int result = 0;
    int numberOne = 0 ;
    int numberTwo = 0 ;

    int OPERATION = 0;

    int TOTAL_OPERATOR = 1;
    int SUB_OPERATOR = 2;
    int MUL_OPERATOR = 3;
    int DIV_OPERATOR = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session5);

        initViews();
    }

    private void initViews() {

        resultTv = findViewById(R.id.as5TextView);
        indicatorTv = findViewById(R.id.as5TextViewIndicator);

        num0 = findViewById(R.id.as5Btn0);
        num1 = findViewById(R.id.as5Btn1);
        num2 = findViewById(R.id.as5Btn2);
        num3 = findViewById(R.id.as5Btn3);
        num4 = findViewById(R.id.as5Btn4);
        num5 = findViewById(R.id.as5Btn5);
        num6 = findViewById(R.id.as5Btn6);
        num7 = findViewById(R.id.as5Btn7);
        num8 = findViewById(R.id.as5Btn8);
        num9 = findViewById(R.id.as5Btn9);

        total = findViewById(R.id.as5BtnTotal);
        sub = findViewById(R.id.as5BtnSub);
        mul = findViewById(R.id.as5BtnMul);
        div = findViewById(R.id.as5BtnDiv);

        clear = findViewById(R.id.as5BtnClear);

        equal = findViewById(R.id.as5BtnEqual);


        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        total.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

        clear.setOnClickListener(this);

        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.as5Btn0:
            case R.id.as5Btn1:
            case R.id.as5Btn2:
            case R.id.as5Btn3:
            case R.id.as5Btn4:
            case R.id.as5Btn5:
            case R.id.as5Btn6:
            case R.id.as5Btn7:
            case R.id.as5Btn8:
            case R.id.as5Btn9:

                Button button = (Button) view;
                txt += button.getText().toString();
                resultTv.setText(txt);

                break;

            case R.id.as5BtnTotal:

                operationNumber(TOTAL_OPERATOR);

                break;

            case R.id.as5BtnSub:

                operationNumber(SUB_OPERATOR);

                break;

            case R.id.as5BtnMul:

                operationNumber(MUL_OPERATOR);

                break;

            case R.id.as5BtnDiv:

                operationNumber(DIV_OPERATOR);

                break;

            case R.id.as5BtnClear:

               numberOne = 0;
               numberTwo = 0;
               txt = "";
               indicatorMsg = "";
               resultTv.setText(txt);
               indicatorTv.setText(indicatorMsg);

                break;


            case R.id.as5BtnEqual:

                if (!resultTv.getText().toString().equals("")){



                    numberTwo = Integer.parseInt(resultTv.getText().toString());

                    if (OPERATION != 0){
                        if (OPERATION == TOTAL_OPERATOR ){

                            result = numberOne + numberTwo ;


                        }else if (OPERATION == SUB_OPERATOR ){

                            result = numberOne - numberTwo ;
                            indicatorMsg = numberOne +" - ";

                        }else if (OPERATION == MUL_OPERATOR ){

                            result = numberOne * numberTwo ;
                            indicatorMsg = numberOne +" * ";

                        }else if (OPERATION == DIV_OPERATOR ){

                            result = numberOne / numberTwo ;
                            indicatorMsg = numberOne +" / ";

                        }

                        indicatorMsg += "" + numberTwo;

                        resultTv.setText(String.valueOf(result));
                        indicatorTv.setText(indicatorMsg);
                    }



                }

                break;


        }

    }

    private void operationNumber(int operator) {
        if (!resultTv.getText().toString().equals("")){
            numberOne = Integer.parseInt(resultTv.getText().toString());
            resultTv.setText("");
            txt = "";
            OPERATION = operator;

            if (OPERATION != 0){
                if (OPERATION == TOTAL_OPERATOR ){

                    indicatorMsg = numberOne +" + ";

                }else if (OPERATION == SUB_OPERATOR ){

                    indicatorMsg = numberOne +" - ";

                }else if (OPERATION == MUL_OPERATOR ){

                    indicatorMsg = numberOne +" * ";

                }else if (OPERATION == DIV_OPERATOR ){

                    indicatorMsg = numberOne +" / ";

                }
                indicatorTv.setText(indicatorMsg);
            }
        }
    }
}
