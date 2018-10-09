package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class belahketupat extends AppCompatActivity {

    EditText d1, d2;
    Button jadi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat);

        d1 = (EditText) findViewById(R.id.D1);
        d2 = (EditText) findViewById(R.id.D2);
        jadi = (Button) findViewById(R.id.button3);
        hasil = (TextView) findViewById(R.id.txt_hasil2);


        jadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d1.length() == 0 && d2.length() == 0) {
                    Toast.makeText(getApplication(), "Diagonal 1 dan Diagonal 2 tidak boleh Kosong", Toast.LENGTH_LONG).show();

                }
                else if (d1.length()==0) {
                    Toast.makeText(getApplication(), "Diagonal 1 tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else if (d1.length()==0) {
                    Toast.makeText(getApplication(), "Diagonal 1 tidak boleh kososng", Toast.LENGTH_LONG).show();

                }
                else if (d2.length()==0) {
                    Toast.makeText(getApplication(), "Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{

                    String isiD1 = d1.getText().toString();
                    String isiD2 = d2.getText().toString();
                    double d1 = Double.parseDouble(isiD1);
                    double d2 = Double.parseDouble(isiD2);
                    double hs = belahketupat (d1,d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }


            }
        });
    }
    public double belahketupat (double d1, double d2) {return d1*d2/2;}
}





