package com.ditto.training.aplikasipenghitungbangun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
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

                if(panjang.equals("")&&lebar.equals("")&&tinggi.equals("")){
                    Toast.makeText(getApplicationContext(),"Semua Field Harus Terisi",Toast.LENGTH_SHORT).show();
                    etPanjang.setError("Field Panjang harus diisi");
                    etLebar.setError("Field Lebar harus diisi");
                    etTinggi.setError("Field Tinggi harus diisi");
                }
                else if(panjang.equals("")){
                    Toast.makeText(getApplicationContext(),"Semua Field Harus Terisi",Toast.LENGTH_SHORT).show();
                    etPanjang.setError("Field Panjang harus diisi");
                    if(lebar.equals("")){
                        etLebar.setError("Field Lebar harus diisi");
                    }
                    else if(tinggi.equals("")){
                        etTinggi.setError("Field Tinggi harus diisi");
                    }
                }
                else if(lebar.equals("")){
                    Toast.makeText(getApplicationContext(),"Semua Field Harus Terisi",Toast.LENGTH_SHORT).show();
                    etLebar.setError("Field Lebar harus diisi");
                    if(tinggi.equals("")){
                        etTinggi.setError("Field Tinggi harus diisi");
                    }
                }
                else if(tinggi.equals("")){
                    Toast.makeText(getApplicationContext(),"Semua Field Harus Terisi",Toast.LENGTH_SHORT).show();
                    etTinggi.setError("Field Tinggi harus diisi");
                }
                else{
                    p=Double.valueOf(panjang);
                    l=Double.valueOf(lebar);
                    t=Double.valueOf(tinggi);
                }

                volume=(p*l*t)/2;

                tvHasil.setText("Luas: "+volume);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
