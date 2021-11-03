package com.company;

public class Main {

    public static void main(String[] args) {

        Funcionario duda = new Funcionario("Duda", 123);
        System.out.println(duda.exibeDados());

        Assistente Lu = new Assistente("Lu", 52423, 50);
        System.out.println(Lu.exibeDados());

    }
}
