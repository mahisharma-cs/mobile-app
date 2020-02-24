package com.example.sampleproject01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info,Info1;
    private Button Login,Sign_up,Forget_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etId);
        Password = (EditText)findViewById(R.id.etPwd);
        Info1 = (TextView)findViewById(R.id.tvinfo);
        Info = (TextView)findViewById(R.id.info2);
        Login = (Button)findViewById(R.id.btnLogin);
        Sign_up = (Button)findViewById(R.id.btnSignup);
        Forget_pwd = (Button)findViewById(R.id.btnfp);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });
        Forget_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Forgot.class);
                startActivity(intent);
            }
        });
    }

    public void validate(String userName,String userPassword){
        String A="admin";
        String pwd="12345";
        if((userName.equals(A)) && (userPassword.equals(pwd))){
            Info1.setText("You have entered correct user name but app is not build");
        }
        else{
            Info.setText("*Your username or password is incorrect");
        }
    }
    @Override
    public void onBackPressed() {
        finishAffinity();

    }
}