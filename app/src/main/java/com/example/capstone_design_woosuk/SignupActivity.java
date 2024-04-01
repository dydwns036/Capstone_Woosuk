package com.example.capstone_design_woosuk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_main);

        EditText edit_Id = findViewById(R.id.editTextEmail);
        EditText edit_Pw = findViewById(R.id.editTextPassword);
        EditText check_Pw = findViewById(R.id.checkeditTextPassword);
        Button btn_Login = findViewById(R.id.buttonLogin);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edit_Id.getText().toString();
                String password = edit_Pw.getText().toString();
                String checkPw = check_Pw.getText().toString();
                }

                if ()
        });
    }
}