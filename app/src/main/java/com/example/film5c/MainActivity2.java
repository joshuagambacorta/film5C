package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String testoStampa=i.getStringExtra("etichetta");
        Toast t = Toast.makeText(getApplicationContext(), testoStampa,Toast.LENGTH_LONG );
        t.show();
    }
}