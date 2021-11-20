package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonCt extends AppCompatActivity {
    private RadioButton CTalpukat, CTapel, CTcerry, CTdurian, CTjambuair,
    CTmanggis, CTstrawberry, CTsemangka, CTsirsak;
    private String PilihKhasCirebon;
    private Button mViewButtonsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_ct);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Inisialisasi Variabel
        CTalpukat = findViewById(R.id.RbAlpukat);
        CTapel = findViewById(R.id.RbApel);
        CTcerry = findViewById(R.id.RbCerry);
        CTdurian = findViewById(R.id.RbDurian);
        CTjambuair = findViewById(R.id.RbJambuAir);
        CTmanggis = findViewById(R.id.RbManggis);
        CTstrawberry = findViewById(R.id.RbStrawberry);
        CTsemangka = findViewById(R.id.RbSemangka);
        CTsirsak = findViewById(R.id.RbSirsak);
        mViewButtonsubmit = findViewById(R.id.btnSubmitDlg);

        // Action Listener Pada Button
        mViewButtonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CTalpukat.isChecked()){
                    PilihKhasCirebon = CTalpukat.getText().toString();
                } else if (CTapel.isChecked()){
                    PilihKhasCirebon = CTapel.getText().toString();
                } else if (CTcerry.isChecked()){
                    PilihKhasCirebon = CTcerry.getText().toString();
                } else if (CTdurian.isChecked()){
                    PilihKhasCirebon = CTdurian.getText().toString();
                } else if (CTjambuair.isChecked()){
                    PilihKhasCirebon = CTjambuair.getText().toString();
                } else if (CTmanggis.isChecked()){
                    PilihKhasCirebon = CTmanggis.getText().toString();
                } else if (CTstrawberry.isChecked()){
                    PilihKhasCirebon = CTstrawberry.getText().toString();
                } else if (CTsemangka.isChecked()){
                    PilihKhasCirebon = CTsemangka.getText().toString();
                } else if (CTsirsak.isChecked()){
                    PilihKhasCirebon = CTsirsak.getText().toString();
                }
                Toast.makeText(getApplicationContext(), "Anda Suka Buah "+PilihKhasCirebon, Toast.LENGTH_LONG).show();
            }
        });
    }
}