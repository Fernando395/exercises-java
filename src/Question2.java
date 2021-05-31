import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota");
        int nota1 = input.nextInt();

        System.out.println("Digite o valor da segunda nota");
        int nota2 = input.nextInt();

        System.out.println("Digite o valor da terceira nota");
        int nota3 = input.nextInt();

        int soma = nota1+nota2+nota3;

        int media = soma / 3;

        if (media == 10){
            System.out.println("Aprovado com louvor");
        } else if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
