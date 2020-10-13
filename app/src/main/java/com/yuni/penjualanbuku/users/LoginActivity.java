package com.yuni.penjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.yuni.penjualanbuku.R;
import com.yuni.penjualanbuku.admin.HomeAdminActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnDaftar;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnLogin = (NoboButton) findViewById(R.id.LoginBtn);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}