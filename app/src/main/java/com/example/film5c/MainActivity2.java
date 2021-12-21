package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView lblTesto;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lblTesto = (TextView)findViewById(R.id.lbl_film);
        ImageView img= (ImageView) findViewById(R.id.image_film);

        Intent i = getIntent();
        String testoStampa=i.getStringExtra("etichetta");
        Toast t = Toast.makeText(getApplicationContext(), testoStampa,Toast.LENGTH_LONG );
        t.show();
        Log.d("controllo_film", "Il film selezionato è: " + testoStampa);


        lblTesto.setText(testoStampa);
        switch (testoStampa) {
            case "Superman":
                img.setImageResource(R.drawable.superman);
                break;

            case "Spiderman":
                img.setImageResource(R.drawable.spiderman);
                break;

            case "Titanic":
                img.setImageResource(R.drawable.titanic);
                break;

            case "Catwoman":
                img.setImageResource(R.drawable.catwoman);
                break;
        }

    }
}