package com.example.a4reduce5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnReduce = findViewById(R.id.btnReduce);
        btnReduce.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        System.out.println("_______________Button Kürze wurde gedrückt");
        EditText etZaehler = findViewById(R.id.etZaehler);
        EditText etNenner = findViewById(R.id.etNenner);

        String szaehler = etZaehler.getText().toString();
        String snenner = etNenner.getText().toString();

        int iZaehler = Integer.parseInt(szaehler);
        int iNenner = Integer.parseInt(snenner);

        if (iZaehler * iNenner != 0) {
            int iRest, iggt = iZaehler,iDivisor = iNenner;
            do{
                iRest = iggt % iDivisor;

                    iggt = iDivisor;
                    iDivisor = iRest;

            }while (iRest > 0);
            etZaehler.setText(Integer.toString(iZaehler/iggt));
            etNenner.setText(Integer.toString(iNenner/iggt));
        }else{
            etZaehler.setText("Ungültige Eingabe");
            etNenner.setText("Ungültige Eingabe");
        }



    }
}