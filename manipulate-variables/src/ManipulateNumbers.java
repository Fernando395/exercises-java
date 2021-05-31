import java.util.Scanner;

public class ManipulateNumbers {
    // ler dois numeros do teclado, guardalos em duas variaveis diferentes, printar eles invertido.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeiroNumero = leitor.nextInt();
        int segundoNumero = leitor.nextInt();

        int terceiroNumero = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = terceiroNumero;

        System.out.println(primeiroNumero + " " + segundoNumero);
    }
}
