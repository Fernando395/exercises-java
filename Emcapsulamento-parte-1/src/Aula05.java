import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite seu nome");
//        String nomeDoDono = scanner.nextLine();
//
//        System.out.println("Digite o tipo de conta desejada");
//        System.out.println("CC para conta corrente");
//        System.out.println("CP para conta poupança");
//        String tipoDeConta = scanner.nextLine();
//
//        ContaBanco p1 = new ContaBanco(nomeDoDono,tipoDeConta );

  ContaBanco p1 = new ContaBanco("CC", "Fernando");
        p1.estadoAtual();

        p1.depositar(20.00);
        p1.estadoAtual();
        p1.sacar(20.00);

        p1.fecharConta();

        p1.setSaldo(1000.00);
        p1.estadoAtual();
    }
}
