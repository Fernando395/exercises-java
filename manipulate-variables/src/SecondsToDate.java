import java.util.Scanner;

public class SecondsToDate {
    /*
     * Leia uma inteiro que represente segundos e converta esse valor para horas minutos e segundos
     * Input: 86399
     * Output: 23:59:59
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int segundosTotais = leitor.nextInt();
        int minutosTotais = segundosTotais / 60;
        int horas = minutosTotais / 60;
        int minutos = minutosTotais % 60;
        int segundos = segundosTotais % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
