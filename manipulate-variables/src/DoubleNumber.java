import java.util.Scanner;

public class DoubleNumber {
    /*
     * Leia um inteiro (N) de 1 a 9  e imprima N / NN / NNN
     * Input : 5
     * Output : 5 / 55 / 555
     * Obs.: Pode ser usado qualquer técnica/recurso aqui, porém a variável DEVE ser lida como int
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um numero de 1 a 9 : ");

        int N = teclado.nextInt();
        int NN = N * 11;
        int NNN = N * 111;
        System.out.println(N + "/" + NN + "/" + NNN);

        String S = teclado.next();
        System.out.println(S + "/" + S + S + "/" + S + S + S);

//        System.out.printf("Uma string %s formatada", S);
//        System.out.println("Uma string " + S + " formatada");

    }
}
