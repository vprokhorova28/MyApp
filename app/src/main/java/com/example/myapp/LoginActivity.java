package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp.ui.me.MeViewModel;

public class LoginActivity extends AppCompatActivity {

    private Button btnSignIn, btnSignUp;
    private Intent i;
    private EditText etMail, etPassword;
    private String mail, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(listener);

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(listener);

        etMail = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);

        i = new Intent(LoginActivity.this, MainActivity.class);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnSignIn) {
                try {
                    mail = etMail.getText().toString();
                    password = etMail.getText().toString();
                    i.putExtra("mail", mail);
                    startActivity(i);
                } catch (NullPointerException e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неверный логин или пароль", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }
    };
}