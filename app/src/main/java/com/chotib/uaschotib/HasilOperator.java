package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilOperator extends AppCompatActivity {

    private TextView txtAngka01, txtAngka02, txtHasil;
    private Integer penjumlahan, penguruangan, perkalian, pembagian, hasilbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_operator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtAngka01 = findViewById(R.id.inpAngka1);
        txtAngka02 = findViewById(R.id.inpAngka2);
        txtHasil = findViewById(R.id.textHasil);

        Bundle bundle = getIntent().getExtras();

        txtAngka01.setText(bundle.getCharSequence("angka1"));
        txtAngka02.setText(bundle.getCharSequence("angka2"));

        String inpAngka1 = txtAngka01.getText().toString();
        String inpAngka2 = txtAngka02.getText().toString();

        int penjumlahan = Integer.valueOf(inpAngka1) + Integer.valueOf(inpAngka2);
        int penguruangan = Integer.valueOf(inpAngka1) - Integer.valueOf(inpAngka2);
        int perkalian = Integer.valueOf(inpAngka1) * Integer.valueOf(inpAngka2);
        int pembagian = Integer.valueOf(inpAngka1) / Integer.valueOf(inpAngka2);
        int hasilsisabagi = Integer.valueOf(inpAngka1) % Integer.valueOf(inpAngka2);

        txtHasil.setText("Penjumlahan = "+penjumlahan+"\nPengurangan = "+penguruangan+"\nPerkalian = "+perkalian+"\nPembagian = "+pembagian+"\nHasil Sisa Bagi = "+hasilsisabagi);
    }
}