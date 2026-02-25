package br.senai;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ContaBancaria conta = new ContaBancaria();

    static void menu() {
        int opcao;

        do {
            opcao = getOpcao();
            if (opcao == 1) {
                fazSaque();
            } else if (opcao == 2) {
                fazDeposito();
            }
            System.out.println("Saldo atual: " + conta.getSaldo());
        } while (opcao != 0);
    }

    private static int getOpcao() {
        int opcao;
        System.out.println("\n1) Depositar");
        System.out.println("2) Sacar");
        System.out.println("0) Sair");
        System.out.print("Escolha: ");

        opcao = sc.nextInt();
        return opcao;
    }

    private static void fazDeposito() {
        System.out.print("Valor para sacar: ");
        double valor = sc.nextDouble();
        try {
            conta.saca(valor);
        } catch (IllegalArgumentException e) { // pega o erro
            System.out.println(e.getMessage()); // mostra a mensagem
        }
    }

    private static void fazSaque() {
        System.out.print("Valor para depositar: ");
        double valor = sc.nextDouble();
        try {
            conta.deposita(valor);
        } catch (IllegalArgumentException e) { // pega o erro
            System.out.println(e.getMessage()); // mostra a mensagem
        }
    }

    public static void main(String[] args) {
        menu();
    }

}