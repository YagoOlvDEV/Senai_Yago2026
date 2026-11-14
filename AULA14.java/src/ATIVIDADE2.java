import java.util.Scanner;

public class ATIVIDADE2 {
    public static void main(String[] args) {

        int opcao;
        double saldo = 1000;
        double deposito, saque;
        String nome;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = ler.nextLine();

        do {
            System.out.println("\nOlá, " + nome);
            System.out.println("Qual comando deseja executar?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Encerrar programa");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    saque = ler.nextDouble();

                    if (saque > 0 && saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Dinheiro sacado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor do depósito:");
                    deposito = ler.nextDouble();

                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        System.out.println("Dinheiro depositado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        ler.close();
    }
}