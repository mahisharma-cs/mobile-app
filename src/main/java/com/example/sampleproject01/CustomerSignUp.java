package com.example.sampleproject01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerSignUp extends AppCompatActivity {
    private Button Login;
    private ImageView img;
    private TextView tvcsp01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_customer_sign_up);
        Login = (Button)findViewById(R.id.btnLoginSp3);
        img = (ImageView)findViewById(R.id.img3);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerSignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
