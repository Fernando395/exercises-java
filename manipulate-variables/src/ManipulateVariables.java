import java.util.Scanner;

public class ManipulateVariables {
    // ler dois nomes do teclado, guardalos em duas variaveis diferentes, printar eles invertido.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String primeiroNome = leitor.next();
        String segundoNome = leitor.next();

        primeiroNome = segundoNome+" "+primeiroNome;
        segundoNome = "";

        System.out.println(primeiroNome +" "+ segundoNome);
    }
}
