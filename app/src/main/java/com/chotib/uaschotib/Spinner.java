package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Spinner extends AppCompatActivity {
    private TextView teks;
    private android.widget.Spinner spinnerct;

    private String[] list = {"-Pilih-", "Pisang", "Apel", "Nanas", "Durian", "Manggis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        teks = findViewById(R.id.teksView);
        spinnerct = findViewById(R.id.spinner_ct);

        ArrayAdapter<String> adapter = new ArrayAdapter<> (this, R.layout.support_simple_spinner_dropdown_item, list);

        spinnerct.setAdapter(adapter);

        spinnerct.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                teks.setText(list[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                teks.setText(list[0]);
            }
        });
    }

    private void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }
}