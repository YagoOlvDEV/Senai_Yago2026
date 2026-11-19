
import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        String situacao = verificarAprovacao(nota1, nota2);

        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);

        ler.close();
    }

    static String verificarAprovacao(double nota1, double nota2) {

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}