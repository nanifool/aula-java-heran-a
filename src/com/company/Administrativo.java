package com.company;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;
    public Administrativo(String nome, int matricula, int horas, String turno, double adicionalNoturno) {
        super(nome, matricula, horas);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public String exibeDados(){
        return super.exibeDados()+"\nTurno: " + turno + "\nAdicional noturno: " + adicionalNoturno;
    }
}
