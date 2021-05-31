import java.util.Scanner;

public class MathematicOperations {
    /*
     * Leia dois números e imprima as operações básicas para estes números
     * - Exemplo:
     * - Input: 25 e 5
     * - Output:
     * Sum 30
     * Sub 20
     * Mul 125
     * Div 5
     * Mod 0
     *
     * * Mod é o resto da divisão, por exemplo 27 dividido por 5 tem resto 2, é o que sobra da divisão
     * * o operador para obter o resto de uma divisão é o símbolo de porcentagem %
     */
    public static void main(String[] args) {
        System.out.print("Escreva 1 numero,clique enter,escreva outro numero e clique enter.:");
        Scanner reader = new Scanner(System.in);
        int um = reader.nextInt();
        int dois = reader.nextInt();
        int soma = um + dois;
        int subit = um - dois;
        int mult = um * dois;
        int divi = um / dois;
        int resto = um % dois;
        System.out.println("sum " + soma);
        System.out.println("sub " + subit);
        System.out.println("mul " + mult);
        System.out.println("div " + divi);
        System.out.println("mod " + resto);


    }
}
