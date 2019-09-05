package com.example.tsiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Bundle extras = getIntent().getExtras();
        String nomeProf = extras.getString("nome");

        int posicao = extras.getInt("posicao");
    Toast.makeText(DetalheActivity.this,nomeProf+":"+posicao,
            Toast.LENGTH_LONG).show();


    }
}
