package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_list_view extends AppCompatActivity {
    TextView Nama_Buah;
    ImageView Gambar_Buah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_view);

        Nama_Buah = findViewById(R.id.nama_buah);
        Gambar_Buah = findViewById(R.id.gambar_buah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent b = getIntent();
        Nama_Buah.setText(b.getStringExtra("Nama Buah"));
        Gambar_Buah.setImageResource(b.getIntExtra("Gambar Buah",0));

    }
}