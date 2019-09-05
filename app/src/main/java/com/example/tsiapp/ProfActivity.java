package com.example.tsiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof);
        ListView lprof = (ListView) findViewById(R.id.listaProf);
final String professores[] = {"Tony","Gilson","Edilson Palma",
                "Kubota"};
ArrayAdapter ladapter = new ArrayAdapter(ProfActivity.this,
        android.R.layout.simple_list_item_1,professores);
       lprof.setAdapter(ladapter);

       lprof.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
       public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

       Intent abrir = new Intent(ProfActivity.this,DetalheActivity.class);

       abrir.putExtra("posicao",position);
       abrir.putExtra("nome",professores[position]);

       startActivity(abrir);



           }
       });


    }
}
