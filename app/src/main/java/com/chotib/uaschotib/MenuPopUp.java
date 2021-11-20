package com.chotib.uaschotib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

public class MenuPopUp extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pop_up);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menupopup);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menusatu:
                Toast.makeText(this, "Menu 1 cliked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menudua:
                Toast.makeText(this, "Menu 2 cliked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menutiga:
                Toast.makeText(this, "Menu 3 cliked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuempat:
                Toast.makeText(this, "Menu 4 cliked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}