import java.util.Scanner;

public class reajusteSalarial3 {

    double salario[] = new double[5];
    double novoSalario[] = new double[5];
    double aumento = 0.10;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        reajusteSalarial3 sistema = new reajusteSalarial3();

        System.out.println("Iniciando Sistema Salarial");

        sistema.lerSalario();
        sistema.calcularNovoSalario();
        sistema.exibirNovoSalario();

        sistema.sc.close();
    }

    void lerSalario() {

        for (int i = 0; i < salario.length; i++) {

            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");

            salario[i] = sc.nextDouble();
        }
    }

    void calcularNovoSalario() {

        for (int i = 0; i < salario.length; i++) {

            novoSalario[i] = salario[i] + (salario[i] * aumento);
        }
    }

    void exibirNovoSalario() {

        for (int i = 0; i < novoSalario.length; i++) {

            System.out.println("O novo salário do funcionário " + (i + 1) +
                    " é: " + novoSalario[i]);
        }
    }
}