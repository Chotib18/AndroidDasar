package com.chotib.uaschotib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Deklarasi Variabel Untuk Contoh Layout Chain dan Layout Login
    private Button mViewButtonOperator, mViewButtonBangunDatar, mViewButtonSpinnerCT,
            mViewButtonMenuPopUp, mViewButtonListView, mViewButtonCustomListView,
            mViewButtonMultimediaVideo, mViewButtonGaleriFoto, mViewButtonWebViev,
            mviewButtonRadio, mViewButtonKeluar;

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflaterct = getMenuInflater();
        inflaterct.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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
                Toast.makeText(this, "Menu 4 cliked opsi", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.submenu1:
                Toast.makeText(this, "Sub Item 1 cliked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.submenu2:
                Toast.makeText(this, "Sub Item 2 cliked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Buat Inisialisasi Button Button Yang Sudah Di Buat
        mViewButtonOperator = (Button)findViewById(R.id.buttonOperator);
        mViewButtonBangunDatar = (Button)findViewById(R.id.buttonBangunDatar);
        mViewButtonSpinnerCT = (Button)findViewById(R.id.buttonSpinner);
        mViewButtonMenuPopUp = (Button)findViewById(R.id.buttonMenuPopUp);
        mViewButtonListView = (Button)findViewById(R.id.buttonListView);
        mViewButtonCustomListView = (Button)findViewById(R.id.buttonCustomListview);
        mViewButtonMultimediaVideo = (Button)findViewById(R.id.buttonMultimediaVideo);
        mViewButtonGaleriFoto = (Button)findViewById(R.id.buttonGaleriFoto);
        mViewButtonWebViev = (Button)findViewById(R.id.buttonWebView);
        mviewButtonRadio = (Button)findViewById(R.id.buttonRadio);
        mViewButtonKeluar = (Button)findViewById(R.id.buttonKeluar);


        // Aksi Listener Button Operator
        mViewButtonOperator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Operator
                startActivity(new Intent(getApplicationContext(),Operator.class));
            }
        });

        // Aksi Listener Button Bangun Datar
        mViewButtonBangunDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Bangun Datar
                startActivity(new Intent(getApplicationContext(), BangunDatar.class));
            }
        });

        // Aksi Listener Button Spinner
        mViewButtonSpinnerCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Spinner
                startActivity(new Intent(getApplicationContext(), Spinner.class));
            }
        });

        // Aksi Listener Button Menu Pod Up
        mViewButtonMenuPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Menu Pop Up
                startActivity(new Intent(getApplicationContext(), MenuPopUp.class));
            }
        });

        // Aksi Listener Button List View
        mViewButtonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class List View
                startActivity(new Intent(getApplicationContext(), ListView.class));
            }
        });

        // Aksi Listener Button Custom List View
        mViewButtonCustomListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Custom List View
                startActivity(new Intent(getApplicationContext(), CostumListView.class));
            }
        });

        // Aksi Listener Button Multimedia Video
        mViewButtonMultimediaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Multimedia Video
                startActivity(new Intent(getApplicationContext(), MultimediaVideo.class));
            }
        });

        // Aksi Listener Button Galeri Foto
        mViewButtonGaleriFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Galeri Foto
                startActivity(new Intent(getApplicationContext(), GaleryFoto.class));
            }
        });

        // Aksi Listener Button Web View
        mViewButtonWebViev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Web View
                startActivity(new Intent(getApplicationContext(), WebViewCt.class));
            }
        });

        // Aksi Listener Button Radio
        mviewButtonRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Untuk memanggil class Radio Button
                startActivity(new Intent(getApplicationContext(), RadioButtonCt.class));
            }
        });

        // Aksi Listener Button Keluar
        mViewButtonKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == mViewButtonKeluar) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Peringatan !")
                            .setIcon(R.drawable.icon2)
                            .setMessage("Apakah anda yakin ingin keluar ?")
                            .setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Peringatan !")
                .setIcon(R.drawable.icon2)
                .setMessage("Apakah anda yakin ingin keluar ?")
                .setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}