package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleryFoto extends AppCompatActivity {
    GridView gridView;
    CtAdapter adapter;
    ViewPager viewPager;

    String[] namaBuah = {"Alpukat","Jambu Air","Cerry","Apel","Durian","Manggis", "Strawberry"};
    int[] gambarBuah = {R.drawable.alpukat,R.drawable.jambu_air,R.drawable.ceri,R.drawable.apel,R.drawable.durian,R.drawable.manggis,R.drawable.strawberry};
    String[] deskripsi = {"Ini Adalah Gambar Buah Alpukat", "Ini Adalah Gambar Buah Jambu Air", "Ini Adalah Gambar Buah Cerry",
    "Ini Adalah Gambar Buah Apel", "Ini Adalah Gambar Buah Durian", "Ini Adalah Gambar Buah Manggis", "Ini Adalah Gambar Buah Strawberry"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_foto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //adapter = new CtAdapter(this);
        //viewPager.setAdapter(adapter);

        gridView = findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
                intent.putExtra("Nama Buah", namaBuah[position]);
                intent.putExtra("Gambar Buah", gambarBuah[position]);
                intent.putExtra("Deskripsi Buah", deskripsi[position]);
                startActivity(intent);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return gambarBuah.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.raw_data,null);

            TextView name = view1.findViewById(R.id.namabuah);
            ImageView image = view1.findViewById(R.id.gambarbuah);

            name.setText(namaBuah[position]);
            image.setImageResource(gambarBuah[position]);
            return view1;
        }




    }

}