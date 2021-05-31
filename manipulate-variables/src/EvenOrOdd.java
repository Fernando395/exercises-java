import java.util.Scanner;

public class EvenOrOdd {
    /*
     * Leia um número e diga se ele é par ou ímpar
     * Input: 5
     * Output: ímpar
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero % 2 > 0) {
            System.out.println("impar");
        } else {
            System.out.println("par");
        }

    }
}
