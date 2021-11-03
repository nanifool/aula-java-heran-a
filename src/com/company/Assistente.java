package com.company;

public class Assistente extends Funcionario{
    private int horas;

    public Assistente(String nome, int matricula, int horas) {
        super(nome, matricula);
        this.horas = horas;
    }

    @Override
    public String exibeDados(){
        return super.exibeDados()+"\nhoras trabalhadas: " + horas;
    }
}
