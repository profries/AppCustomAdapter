package com.example.iossenac.appcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Aluno> listaAlunos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaLista();

        ListView listViewAlunos = (ListView) findViewById(R.id.listViewAlunos);
        listViewAlunos.setAdapter(new AlunoAdapter(this,listaAlunos));
    }

    private void iniciaLista() {
        listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("001","Fulano","fulano@mail.com"));
        listaAlunos.add(new Aluno("002","Sicrano","sicrano@mail.com"));
        listaAlunos.add(new Aluno("003","Beltrano","beltrano@mail.com"));

    }


}
