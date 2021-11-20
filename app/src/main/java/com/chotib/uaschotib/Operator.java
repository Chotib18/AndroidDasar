package com.chotib.uaschotib;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Operator extends AppCompatActivity {
    // Mendeklarasikan Variabel
    private EditText editAngka1, editAngka2;
    private Button butnToast, butnDialog, butnKirim;
    private TextView txtTambah, txtKurang, txtKali, txtBagi, txtSisaBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Buat Inisialisasi pada komponen widget yang diperlukan
        editAngka1 = (EditText) findViewById(R.id.edit_angka1);
        editAngka2 = (EditText) findViewById(R.id.edit_angka2);
        butnToast = (Button) findViewById(R.id.btn_toast);
        butnDialog = (Button) findViewById(R.id.btn_dialog);
        butnKirim = (Button) findViewById(R.id.btn_kirim);
        txtTambah = (TextView) findViewById(R.id.tv_HasilPenjumlahan);
        txtKurang = (TextView) findViewById(R.id.tv_HasilPengurangan);
        txtKali = (TextView) findViewById(R.id.tv_HasilPerkalian);
        txtBagi = (TextView) findViewById(R.id.tv_HasilPembagian);
        txtSisaBagi = (TextView) findViewById(R.id.tv_HasilSisaBagi);

        butnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Operator.this, "Berhasil !", Toast.LENGTH_LONG).show();
                prosesHitung();
            }
        });

        butnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Operator.this);
                dialog.setTitle("Perhitungan Operator Aritmatika");
                dialog.setMessage("\nBerhasil !");
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
                prosesHitung();
            }
        });

        butnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HasilOperator.class);
                Bundle bundle = new Bundle();
                bundle.putString("angka1", editAngka1.getText().toString());
                bundle.putString("angka2", editAngka2.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);

                prosesHitung();
            }
        });
    }

    private void prosesHitung() {
        Float angka1 = Float.parseFloat(editAngka1.getText().toString());
        Float angka2 = Float.parseFloat(editAngka2.getText().toString());
        Float hasil;
        hasil = angka1 + angka2;
        txtTambah.setText("Penjumlahan = "+hasil);
        hasil = angka1 - angka2;
        txtKurang.setText("Pengurangan = "+hasil);
        hasil = angka1 * angka2;
        txtKali.setText("Perkalian = "+hasil);
        hasil = angka1 / angka2;
        txtBagi.setText("Pembagian = "+hasil);
        hasil = angka1 % angka2;
        txtSisaBagi.setText("Sisa Hasil Bagi = "+hasil);
    }
}