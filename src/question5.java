import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit");
        int fahrenheit = input.nextInt();

        int celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura " + fahrenheit + " Fahrenheit em Celsius é " + celsius);
    }
}