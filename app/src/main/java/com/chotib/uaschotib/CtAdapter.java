package com.chotib.uaschotib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CtAdapter extends PagerAdapter {
    String[] namaBuah = {"Alpukat","Jambu Air","Cerry","Apel","Durian","Manggis", "Strawberry"};
    private int [] imgs = {R.drawable.alpukat,R.drawable.jambu_air,R.drawable.ceri,R.drawable.apel,
            R.drawable.durian,R.drawable.manggis,R.drawable.strawberry};

    private LayoutInflater inflater;
    private Context ctx;

    public CtAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.raw_data,container,false);
        ImageView img = (ImageView)v.findViewById(R.id.gambarbuah);
        TextView tv = (TextView)v.findViewById(R.id.namabuah);

        img.setImageResource(imgs[position]);
        tv.setText(namaBuah[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }


}
