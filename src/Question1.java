import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("Numero ímpar");
        }
    }
}
