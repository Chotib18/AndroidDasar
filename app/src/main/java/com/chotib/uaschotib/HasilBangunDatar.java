package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilBangunDatar extends AppCompatActivity {

    TextView panjang_1, lebar_1, txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_bangun_datar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        panjang_1 = findViewById(R.id.inpPanjang);
        lebar_1 = findViewById(R.id.inpLebar);
        txtHasil = findViewById(R.id.textHasil);

        Bundle bundle = getIntent().getExtras();

        panjang_1.setText(bundle.getCharSequence("panjang"));
        lebar_1.setText(bundle.getCharSequence("lebar"));

        String inpPanjang1 = panjang_1.getText().toString();
        String inpLebar1 = lebar_1.getText().toString();

        int luas = Integer.valueOf(inpPanjang1) * Integer.valueOf(inpLebar1);
        int keliling = 2 * (Integer.valueOf(inpPanjang1) - Integer.valueOf(inpLebar1));
        txtHasil.setText("Luas = "+luas+"\nKeliling = "+keliling);
    }
}