import java.util.Scanner;

public class AverageMean {
    /*
     * Leia 3 números e imprima a média aritmética
     * Input: 15 10 5
     * Output: 10
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Escreva 3 numeros: ");
        int numero1 = reader.nextInt();
        int numero2 = reader.nextInt();
        int numero3 = reader.nextInt();
        int soma = numero1 + numero2 + numero3;
        int media = soma / 3;
        System.out.println(media);

    }
}
