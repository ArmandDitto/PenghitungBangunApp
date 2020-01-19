package com.ditto.training.aplikasipenghitungbangun;

import android.app.UiAutomation;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private TextView tvNama;
    private Button btnPrisma, btnContactUs, btnGithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        btnPrisma=findViewById(R.id.btn_prisma);
        btnContactUs=findViewById(R.id.btn_contact_us);
        btnGithub=findViewById(R.id.btn_github);
        tvNama=findViewById(R.id.tv_namamenuku);

        if(getIntent().getExtras()!= null) {
            tvNama.setText(getIntent().getStringExtra("nama"));
        }

        btnPrisma.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent pindahKePrisma = new Intent(MenuActivity.this,MainActivity.class);
               startActivity(pindahKePrisma);
           }
        });

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noHP = "082261582997";
                Uri telp = Uri.parse("tel:"+noHP);
                Intent contactUs = new Intent(Intent.ACTION_DIAL, telp);
                if(contactUs.resolveActivity(getPackageManager())!=null){
                    startActivity(contactUs);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Tidak ada aplikasi yang sesuai", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dom = "www.github.com/ArmandDitto";
                Uri browse = Uri.parse("http://"+dom);
                Intent domain = new Intent(Intent.ACTION_VIEW, browse);
                Intent chooser = Intent.createChooser(domain, "Buka Aplikasi dengan:");
                if(domain.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }
                else{
                    //write code
                }
            }
        });




    }
}
