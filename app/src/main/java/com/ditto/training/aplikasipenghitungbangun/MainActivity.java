package com.ditto.training.aplikasipenghitungbangun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPanjang,etLebar,etTinggi;
    private Button btnHitung;
    private TextView tvHasil;
    private String panjang, lebar,tinggi;
    private double p,l,t, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang=findViewById(R.id.et_panjang);
        etLebar=findViewById(R.id.et_lebar);
        etTinggi=findViewById(R.id.et_tinggi);
        btnHitung=findViewById(R.id.btn_hitung);
        tvHasil=findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang=etPanjang.getText().toString().trim();
                lebar=etLebar.getText().toString().trim();
                tinggi=etTinggi.getText().toString().trim();

                p=Double.valueOf(panjang);
                l=Double.valueOf(lebar);
                t=Double.valueOf(tinggi);

                volume=(p*l*t)/2;

                tvHasil.setText("Luas: "+volume);
            }
        });





    }

}