package com.ditto.training.aplikasipenghitungbangun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NamaActivity extends AppCompatActivity {
    private Button btnMenu;
    private EditText etNama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);
        btnMenu=findViewById(R.id.btn_next);
        etNama = findViewById(R.id.et_nama);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMenu = new Intent(NamaActivity.this, MenuActivity.class);
                btnMenu.putExtra("nama", etNama.getText().toString());
                startActivity(btnMenu);

            }
        });
    }


}
