package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String jevin="bca";

    TextView loginText;
    EditText email, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailField);
        password = findViewById(R.id.passwordField);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateEmail(email);
               Log.d("test", "oncreate");

                Intent i = new Intent(MainActivity.this,Activity2.class);
                i.putExtra("key","jebin");
                startActivity(i);



               }

            });



        }
    private boolean validateEmail(EditText email) {
        String emailInput = email.getText().toString();

        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            Toast.makeText(this, "Email valid", Toast.LENGTH_SHORT).show();
            return true;
        }else{
            Toast.makeText(this, "Email not valid", Toast.LENGTH_SHORT).show();
            return false;
        }
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(jevin, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(jevin, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(jevin, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(jevin, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(jevin, "onStop: ");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(jevin, "onDestroy: ");
    }



    }
