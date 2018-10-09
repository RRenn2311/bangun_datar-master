package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt(View view){
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }
    public void btn_blk(View view){
        Intent blk = new Intent(Dashboard.this, belahketupat.class);
        startActivity(blk);
    }
    public void btn_jgj(View view){
        Intent jgj = new Intent(Dashboard.this, jajargenjang.class);
        startActivity(jgj);
    }
    public void btn_psgi(View view){
        Intent psgi = new Intent(Dashboard.this, psg.class);
        startActivity(psgi);
    }
}

