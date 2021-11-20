  package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

  public class CostumListView extends AppCompatActivity {
    ListView List;

    private String[]
            nama_buah={"Alpukat","Apel","Cerry","Durian","Jambu Air","Manggis","Strawberry"};
    private Integer [] id_gambar_buah={R.drawable.alpukat,
            R.drawable.apel,R.drawable.ceri,R.drawable.durian,
            R.drawable.jambu_air,R.drawable.manggis,R.drawable.strawberry};
    private  Integer [] id_suara_buah={R.raw.alpukat,R.raw.apel,R.raw.ceri,R.raw.durian,
            R.raw.jambu_air,R.raw.manggis,R.raw.strawberry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costum_list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List = findViewById(R.id.list_view);

        CostumAdapter costumAdapter = new CostumAdapter();
        List.setAdapter(costumAdapter);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),detail_list_view.class);
                intent.putExtra("Nama Buah", nama_buah[position]);
                intent.putExtra("Gambar Buah", id_gambar_buah[position]);
                startActivity(intent);
                MediaPlayer mp = new MediaPlayer();
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+id_suara_buah[position]);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mp.setDataSource(CostumListView.this, uri);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    mp.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mp.start();
            }
        });
    }

    private class CostumAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return id_gambar_buah.length;
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
            View view2 = getLayoutInflater().inflate(R.layout.row_data_custom_list_view, null);

            TextView buahnama = view2.findViewById(R.id.namabuahCLV);
            ImageView buahgambar = view2.findViewById(R.id.gambarbuahCLV);

            buahnama.setText(nama_buah[position]);
            buahgambar.setImageResource(id_gambar_buah[position]);
            return view2;
        }
    }
}