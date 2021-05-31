import java.util.Scanner;

public class AdultOrNot {
    /*
     * Leia o nome e a idade de uma pessoa e imprima se ela é maior ou menor de idade
     * Input:
     * Nome: Maria
     * Idade: 50
     *
     * Output:
     * Maria é maior de idade
     *
     * Obs.: Aqui precisa usar if, exercício opcional :)
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva seu nome");
        String name = reader.next();

        System.out.println("Escreva sua idade");
        int age = reader.nextInt();

        if (age >= 18) {
            System.out.println(name + " é maior de idade");
        } else {
            System.out.println(name + " é menor de idade");
        }
    }

}
