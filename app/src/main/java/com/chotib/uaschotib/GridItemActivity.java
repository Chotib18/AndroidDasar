package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {

    TextView NamaBuah;
    ImageView GambarBuah;
    TextView DeskripsiBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NamaBuah = findViewById(R.id.grid_data);
        GambarBuah = findViewById(R.id.gambarView);
        DeskripsiBuah = findViewById(R.id.grid_deskripsi);

        Intent intent = getIntent();
        NamaBuah.setText(intent.getStringExtra("Nama Buah"));
        GambarBuah.setImageResource(intent.getIntExtra("Gambar Buah",0));
        DeskripsiBuah.setText(intent.getStringExtra("Deskripsi Buah"));

    }
}