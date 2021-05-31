package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("asdasdasd");

        Scanner input = new Scanner(System.in);
        int numberLocation = 0;
        numberLocation = input.nextInt();


        while (numberLocation > 3 || numberLocation < 1) {
            System.out.println("Local inválido!");
        }

        // && e
        // || ou


        if (numberLocation == 1) {
            System.out.println("O balcão do caixa está com gotas de sangue!");
        } else if (numberLocation == 2) {
            System.out.println("O guarda do parque viu uma pessoa estranha correndo na noite anterior!");
        } else if (numberLocation == 3) {
            System.out.println("Alunos relataram que encontraram o refeitório com caderas quebradas!");
        }


        // continua

        // Design Pattern
        // Factory - Fábrica

    }
}
