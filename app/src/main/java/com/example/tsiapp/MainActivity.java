package com.example.tsiapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void abreDisciplina(View view)
    {
    Intent abrir = new Intent(MainActivity.this,DiscActivity.class);
    startActivity(abrir);

    }

    public void abreProfessor(View view)
    {
        Intent abrir = new Intent(MainActivity.this,ProfActivity.class);
        startActivity(abrir);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int idSelecionado = item.getItemId();
        if(idSelecionado==R.id.ligar)
        {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 99999-1411"));
        startActivity(i);
        }
        if(idSelecionado==R.id.site)
        {
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://tsicoxim.eti.br"));
        startActivity(i);
        }
        if(idSelecionado==R.id.sms)
        {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("sms:67999999-1411"));
            i.putExtra("sms_body","Salva eu coordendador");
            startActivity(i);
        }
        if(idSelecionado==R.id.email)
        {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("mailto:tony.santos@ifm.edu.br"));
            i.putExtra("subject","Pergunta Aluno - TSI");
            i.putExtra("body","Salva eu coordendador...");
            startActivity(i);

        }



        return super.onOptionsItemSelected(item);
    }
}
