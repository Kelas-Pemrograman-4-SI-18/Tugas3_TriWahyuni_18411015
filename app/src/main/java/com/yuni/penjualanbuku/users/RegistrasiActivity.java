package com.yuni.penjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuni.penjualanbuku.R;

public class RegistrasiActivity extends AppCompatActivity {

    Button btnAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnAkun = (Button) findViewById(R.id.btnAkun);

        btnAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}