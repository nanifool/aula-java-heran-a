package com.company;

public class Tecnico extends Assistente{
    private double bonusSalarial;
    public Tecnico(String nome, int matricula, int horas, double bonusSalarial) {
        super(nome, matricula, horas);
        this.bonusSalarial = bonusSalarial;
    }
}
