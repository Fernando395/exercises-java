import java.util.Scanner;

public class MultTableFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        // for (variavelControle; condicaoParaContinuar; cadaIteracao) {}
        for (int i = 1; i <= 10; i += 1) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }

        // com while
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + "x" + i + "=" + numero*i);
            i++;
        }

        int j = 0;
        boolean continua = true;
        while (continua) {
            if (j >= 10) {
                continua = false;
            }

            int resultado = j * numero;
            System.out.println(resultado);
            j++;
        }

        int l = 0;
        while (true) {
            if (l >= 10) {
                break;
            }

            int resultado = l * numero;
            System.out.println(resultado);
            l++;
        }
    }
}
