package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class OpeningActivity extends AppCompatActivity {

    public static final String TAG = "Opening Activity";
    private ImageView ivInsta;
    private Button loginBtn;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        ivInsta = findViewById(R.id.ivInsta);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "inside of main activity");
                Intent i = new Intent(OpeningActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }

        });


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "inside of main activity");
                Intent i = new Intent(OpeningActivity.this, SignupActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}