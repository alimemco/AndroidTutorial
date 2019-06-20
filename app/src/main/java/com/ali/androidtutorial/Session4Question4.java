package com.ali.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Session4Question4 extends AppCompatActivity {

    EditText yAli , mAli , dAli ,yMmd , mMmd , dMmd;
    Button btn;
    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session4_question4);

        yAli = findViewById(R.id.session4question4EdYearAli);
        mAli = findViewById(R.id.session4question4EdMonAli);
        dAli = findViewById(R.id.session4question4EdDayAli);

        yMmd = findViewById(R.id.session4question4EdYearMamad);
        mMmd = findViewById(R.id.session4question4EdMonMamad);
        dMmd = findViewById(R.id.session4question4EdDayMamad);

        btn = findViewById(R.id.session4question4Btn);
        tv = findViewById(R.id.session4question4TvRes);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (yAli.getText() != null && mAli.getText() != null && dAli.getText() != null &&
                        yMmd.getText() != null && mMmd.getText() != null && dMmd.getText() != null

                ){

                    if (!yAli.getText().toString().equals("") && !mAli.getText().toString().equals("") && !dAli.getText().toString().equals("") &&
                            !yMmd.getText().toString().equals("") && !mMmd.getText().toString().equals("") && !dMmd.getText().toString().equals("")){

                        int yearAli = Integer.parseInt(yAli.getText().toString());
                        int yearMmd = Integer.parseInt(yMmd.getText().toString());

                        if (yearAli > yearMmd){
                            tv.setText("محمد بزرگتر است");
                        }else  if (yearAli < yearMmd){

                            tv.setText("علی بزرگتر است");
                        }else {

                            int MonAli = Integer.parseInt(mAli.getText().toString());
                            int MonMmd = Integer.parseInt(mMmd.getText().toString());

                            if (MonAli > MonMmd){
                                tv.setText("محمد بزرگتر است");
                            }else  if (MonAli < MonMmd){

                                tv.setText("علی بزرگتر است");
                            }else {

                                int dayAli = Integer.parseInt(dAli.getText().toString());
                                int dayMmd = Integer.parseInt(dMmd.getText().toString());

                                if (dayAli > dayMmd){
                                    tv.setText("محمد بزرگتر است");
                                }else  if (dayAli < dayMmd){

                                    tv.setText("علی بزرگتر است");
                                }else {

                                    tv.setText("علی و محمد هم سن هستند");

                                }

                            }

                        }

                    }else {
                        Toast.makeText(Session4Question4.this, "خالی است", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Session4Question4.this, "خالی", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
