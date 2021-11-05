package com.company;

public class Main {

    public static void main(String[] args) {

        Funcionario duda = new Funcionario("Duda", 123);
        System.out.println(duda.exibeDados());

        Assistente Lu = new Assistente("Lu", 52423, 50);
        System.out.println(Lu.exibeDados());

        Tecnico Alice = new Tecnico("Alice", 3232, 12, 22.21);
        System.out.println(Alice.exibeDados());

        Administrativo Roger = new Administrativo("Roger", 4234, 20, "Integral", 22.70);
        System.out.println(Roger.exibeDados());

    }
}
