package com.example.tsiapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DiscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disc);
ListView ldisc = (ListView) findViewById(R.id.listaDisc);
final String disciplinas[] = {"Dispositivos móveis 1","Linguagem Prog 3",
            "Engenharia de Software 1", "Redes 2",
            "Medologia Científica ","CPW 4"};

final String horarios[] = {"Seg: 18h50","Ter: 18h50",
                "Qua:18h50", "Qui:18h50",
                "Sex:18h50","Seg:20h20"};

ArrayAdapter ladapter = new ArrayAdapter(DiscActivity.this,
            android.R.layout.simple_list_item_1,disciplinas);

      ldisc.setAdapter(ladapter);

  ldisc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
  @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
      {
    Toast.makeText(DiscActivity.this,horarios[position],
          Toast.LENGTH_LONG).show();

AlertDialog.Builder alerta = new AlertDialog.Builder(DiscActivity.this);
          alerta.setTitle(disciplinas[position]);
          alerta.setMessage("Horário: "+horarios[position]);

          alerta.setPositiveButton("OK",null);
          alerta.setNegativeButton("Ee joão!",null);

          alerta.show();






      }
  });




    }

}
