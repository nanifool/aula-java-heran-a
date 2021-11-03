package com.company;

public class Funcionario {
    private String nome;
    private int matricula;

    public String exibeDados(){
        return "matricula: " + matricula + "\n"
                + "nome: " + nome;

    }

    public int getMatricula() {
        return matricula;
    }

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
