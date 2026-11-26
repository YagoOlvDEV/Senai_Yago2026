import java.util.Scanner;

public class TexteBanco {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco do Senai!!!");
        System.out.println("------------------------------------");

        System.out.print("Digite o nome do usuario: ");
        String nome = leia.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numeroConta = leia.nextInt();

        System.out.print("Digite o numero da agencia: ");
        int agencia = leia.nextInt();

        System.out.print("Digite a senha: ");
        int senha = leia.nextInt();

        // Criando a conta bancária
        ContaBancaria conta = new ContaBancaria(nome, agencia, numeroConta);

        // Verificando login
        if (login(nome,numeroConta, agencia, senha)) {

            escolha(leia, conta);

        } else {

            System.out.println("Acesso negado!");
        }

        leia.close();
    }

    public static boolean login(String nome, int numeroConta, int agencia, int senha) {

        if (numeroConta == 2291 && agencia == 1234 && senha == 123) {

            System.out.println("Login realizado com sucesso! Bem vindo ao Banco do Senai! "+ nome);

            return true;

        } else {

            System.out.println("Login falhou. Verifique suas credenciais.");

            return false;
        }
    }

    public static void escolha(Scanner leia, ContaBancaria conta) {

        int escolha;

        do {

            System.out.println("\n===== BANCO DO SENAI =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opcao: ");

            escolha = leia.nextInt();

            switch (escolha) {

                case 1:

                    conta.consultarSaldo();

                    break;

                case 2:

                    System.out.print("Digite o valor para depositar: ");
                    double deposito = leia.nextDouble();

                    conta.depositar(deposito);

                    break;

                case 3:

                    System.out.print("Digite o valor para sacar: ");
                    double saque = leia.nextDouble();

                    conta.sacar(saque);

                    break;

                case 4:

                    System.out.println("Saindo do sistema...");

                    break;

                default:

                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (escolha != 4);
    }
}