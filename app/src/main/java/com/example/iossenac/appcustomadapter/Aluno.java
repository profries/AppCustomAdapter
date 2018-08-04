package com.example.iossenac.appcustomadapter;

public class Aluno {
    private String matricula, nome, email;

    public Aluno(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }


    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

}
