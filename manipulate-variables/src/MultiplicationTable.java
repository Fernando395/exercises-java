import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class MultiplicationTable {
    /*
     * Leia um número e imprima a sua tabuada
     * Exemplo:
     * Input: 5
     * Output:
     * 5 x 1 = 5
     * 5 x 2 = 10
     * 5 x 3 = 15
     * 5 x 4 = 20
     * 5 x 5 = 25
     * 5 x 6 = 30
     * 5 x 7 = 35
     * 5 x 8 = 40
     * 5 x 9 = 45
     * 5 x 10 = 50
     */
    public static void main(String[] args) {
        System.out.print("Escreva um numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int mult1 = numero * 1;
        int mult2 = numero * 2;
        int mult3 = numero * 3;
        int mult4 = numero * 4;
        int mult5 = numero * 5;
        int mult6 = numero * 6;
        int mult7 = numero * 7;
        int mult8 = numero * 8;
        int mult9 = numero * 9;

        System.out.println(numero + " x " + 1 + " = " + mult1);
        System.out.println(numero + " x " + 2 + " = " + mult2);
        System.out.println(numero + " x " + 3 + " = " + mult3);
        System.out.println(numero + " x " + 4 + " = " + mult4);
        System.out.println(numero + " x " + 5 + " = " + mult5);
        System.out.println(numero + " x " + 6 + " = " + mult6);
        System.out.println(numero + " x " + 7 + " = " + mult7);
        System.out.println(numero + " x " + 8 + " = " + mult8);
        System.out.println(numero + " x " + 9 + " = " + mult9);
    }
}



