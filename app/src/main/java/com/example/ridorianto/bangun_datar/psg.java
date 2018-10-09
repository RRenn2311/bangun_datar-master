package com.example.ridorianto.bangun_datar;

/**
 * Created by Farras haidar on 10/8/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class psg extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText s, i;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_psg);

        //Deklarasi yang dikaitkan dengan id file xml
        s = (EditText) findViewById(R.id.sisi1);
        i = (EditText) findViewById(R.id.sisi2);
        b = (Button) findViewById(R.id.button4);
        hasil = (TextView) findViewById(R.id.txt_hasil4);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(s.length()== 0 && i.length()== 0){
                    Toast.makeText(getApplication(),"sisi 1 dan sisi 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(s.length() == 0){
                    Toast.makeText(getApplication(), "sisi 1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(i.length() == 0){
                    Toast.makeText(getApplication(), "sisi 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isisisi = s.getText().toString();
                    String isisisi2 = i.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double i = Double.parseDouble(isisisi2);
                    double hs = psg (s,i);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double psg(double s, double i){
        return s*i;
    }
}
