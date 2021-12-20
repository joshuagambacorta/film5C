package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String film[] = {"Spiderman", "Titanic", "Catwoman", "Superman"};
    ListView lvFilm;
    Button btnEsci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFilm = (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(
                this, android.R.layout.simple_expandable_list_item_1, film
        );

        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo = (String)lvFilm.getItemAtPosition(position);
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("etichetta", "ciao");
                startActivity(i);
                Log.d("click_provdedura", "Hai cliccato sulla " + position + " voce.");
            }
        });

        lvFilm.setAdapter(aaFilm);

        btnEsci = (Button)findViewById(R.id.btnesci);

        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "prova", Toast.LENGTH_SHORT).show();
            }
        });

    }
}