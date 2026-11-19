import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static PrintStream IO = System.out;
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        var conta = new ContaBancaria();

        int opcao;

        do {
            consultarSaldo(conta);
            opcao = menu();
            switch (opcao) {
                case 1 -> depositar(conta);
                case 2 -> sacar(conta);
                case 0 -> IO.println("Encerrando o programa...");
                default -> IO.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static int menu() {
        IO.println("\n=== BANCO ===");
        IO.println("1 - Depositar");
        IO.println("2 - Sacar");
        IO.println("0 - Sair");
        IO.print("Escolha uma opção: ");
        return Integer.parseInt(leitor.nextLine());
    }

    public static void depositar(ContaBancaria conta) {
        double valor = lerValor("Valor do depósito: ");

        conta.depositar(valor);

        IO.println("Depósito realizado!");
    }

    public static void sacar(ContaBancaria conta) {
        double valor = lerValor("Valor do saque: ");

        conta.sacar(valor);

        IO.println("Saque realizado!");
    }

    public static void consultarSaldo(ContaBancaria conta) {
        IO.printf("\nSaldo atual: R$ %.2f", conta.getSaldo());
    }

    public static double lerValor(String mensagem) {
        IO.print(mensagem);
        return Double.parseDouble(leitor.nextLine());
    }

}