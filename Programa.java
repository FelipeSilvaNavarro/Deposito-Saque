package exercicios.banco.aplicacao;

import exercicios.banco.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o nome do dono: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("Deseja fazer um deposito inicial (s/n)? ");
        char resposta = scanner.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Digite o valor inicial: ");
            double depositoInicial = scanner.nextDouble();
            conta = new Conta(depositoInicial, numero, nome);
        }
        else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor para deposito: ");
        double valorDeposito = scanner.nextDouble();
        conta.addSaldo(valorDeposito);

        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();
        conta.remSaldo(valorSaque);

        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        scanner.close();
    }
}
