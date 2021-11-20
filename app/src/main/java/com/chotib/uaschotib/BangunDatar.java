 package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class BangunDatar extends AppCompatActivity {
     private EditText edtPanjang;
     private EditText edtLebar;
     private Button btnHitung, btnKirim, btnReset;
     private TextView tvLuas;
     private TextView tvKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Inisialisasi
        edtPanjang = findViewById(R.id.edit_panjang);
        edtLebar = findViewById(R.id.edit_lebar);
        btnHitung = findViewById(R.id.btn_htg);
        btnKirim = findViewById(R.id.btn_Krm);
        btnReset = findViewById(R.id.btn_reset);
        tvLuas = findViewById(R.id.tv_luas);
        tvKeliling = findViewById(R.id.tv_keliling);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BangunDatar.this, "Berhasil !", Toast.LENGTH_LONG).show();
                hitungLuas();
                hitungKeliling();
            }
        });

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), HasilBangunDatar.class);
                Bundle bundle = new Bundle();
                bundle.putString("panjang", edtPanjang.getText().toString());
                bundle.putString("lebar", edtLebar.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);

                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                if (panjang.isEmpty()) {
                    edtPanjang.isFocusable();
                } else if (lebar.isEmpty()) {
                    edtLebar.isFocusable();
                } else {
                    int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar);
                    int keliling = 2 * (Integer.valueOf(panjang) - Integer.valueOf(lebar));
                    tvLuas.setText("Luas = " + luas);
                    tvKeliling.setText("Keliling = "+keliling);
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtPanjang.setText(null);
                edtLebar.setText(null);;
                tvLuas.setText("Luas = ");
                tvKeliling.setText("Keliling = ");
            }
        });
    }

     // inputan tanpa parameter
     private void hitungLuas() {
         String panjang = edtPanjang.getText().toString();
         String lebar = edtLebar.getText().toString();
         //int luas = Integer.valueOf(panjang) * Integer.valueOf(lebar); // ini juga bisa
         int luas = Integer.parseInt(panjang) * Integer.parseInt(lebar);
         tvLuas.setText("Luas = " + luas);
     }

     // inputan tanpa parameter
     private void hitungKeliling() {
         String panjang = edtPanjang.getText().toString();
         String lebar = edtLebar.getText().toString();
         int keliling = 2 * (Integer.valueOf(panjang) + Integer.valueOf(lebar) );
         // int keliling = Integer.parseInt(panjang) * Integer.parseInt(lebar); // ini juga bisa
         tvKeliling.setText("Keliling = "+keliling);
     }
}