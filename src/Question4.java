import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = input.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números é " + soma);

    }
}
