package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.lang.reflect.Array;
import java.util.List;

public class ListView extends AppCompatActivity {
    //DEKLARASI VARIABLE
    android.widget.ListView list;
    //isi dari item-iem nya dijadikan Array
    String[]
            nama_buah={"Alpukat","Apel","Ceri","Durian","Jambu","Manggis","Strawberry",
            "Nanas", "Semangka", "Anggur", "Jambu Air", "Jeruk", "Mangga"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        // pemanggilan ID ListView yang berada di activity_main
        list=(android.widget.ListView) findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mengisi ListView dengan nilai pada array, kita butuh array adapter
        ArrayAdapter adapter=new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,nama_buah);

        //untuk menampung array ke drop down
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        //memindahkan data dari arrayadapter ke ListView
        list.setAdapter(adapter);
    }
}