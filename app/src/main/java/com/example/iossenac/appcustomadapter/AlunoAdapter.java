package com.example.iossenac.appcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AlunoAdapter extends BaseAdapter {
    private List<Aluno> listaAlunos;
    private Context contexto;

    public AlunoAdapter(Context contexto, List<Aluno> listaAlunos){
        this.contexto = contexto;
        this.listaAlunos = listaAlunos;
    }

    @Override
    public int getCount() {
        return listaAlunos.size();
    }

    @Override
    public Object getItem(int posicao) {
        return listaAlunos.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup viewGroup) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.list_item_alunos,viewGroup,false);

        Aluno aluno = listaAlunos.get(posicao);

        TextView textMatricula = (TextView) view.findViewById(R.id.textMatricula);
        TextView textNome = (TextView) view.findViewById(R.id.textNome);
        TextView textEmail = (TextView) view.findViewById(R.id.textEmail);

        textMatricula.setText(aluno.getMatricula());
        textNome.setText(aluno.getNome());
        textEmail.setText(aluno.getEmail());

        return view;
    }
}
