package com.example.sampleproject01;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private ImageView img01;
    private TextView tvsp01;
    private RadioGroup account_type;
    private Button Next,Login;
    private int select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_up);

        Next = (Button) findViewById(R.id.btnNext);
        img01 = (ImageView) findViewById(R.id.img1);
        tvsp01 = (TextView) findViewById(R.id.tvsp1);
        Login = (Button) findViewById(R.id.btnLoginSp);
        account_type = (RadioGroup) findViewById(R.id.AccountType);
        account_type.setOnCheckedChangeListener(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(select == 1){
                    Intent intent = new Intent(SignUp.this, BusinessSignUp.class);
                    startActivity(intent);
                }
                else if(select == 2){
                    Intent intent = new Intent(SignUp.this, CustomerSignUp.class);
                    startActivity(intent);
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Please select your desire account type";
                    int time = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context,text,time);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rbtn1:
                select=1;
            break;
            case R.id.rbtn2:
                select=2;
            break;
        }
    }
}