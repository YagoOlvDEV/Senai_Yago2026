
import java.util.Scanner;

public class temperaturaDaSemana4 {

    public static void main(String[] args) {

        double segunda, terça, quarta, quinta, sexta, sabado, domingo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura da segunda-feira: ");
        segunda = scanner.nextDouble();

        System.out.println("Digite a temperatura da terça-feira: ");
        terça = scanner.nextDouble();

        System.out.println("Digite a temperatura da quarta-feira: ");
        quarta = scanner.nextDouble();

        System.out.println("Digite a temperatura da quinta-feira: ");
        quinta = scanner.nextDouble();

        System.out.println("Digite a temperatura da sexta-feira: ");
        sexta = scanner.nextDouble();

        System.out.println("Digite a temperatura do sábado: ");
        sabado = scanner.nextDouble();

        System.out.println("Digite a temperatura do domingo: ");
        domingo = scanner.nextDouble();

        double mediaSemana = media(segunda, terça, quarta,
                quinta, sexta, sabado, domingo);

        System.out.printf("A média das temperaturas da semana é: %.2f%n",
                mediaSemana);

        System.out.println("\nDias acima da média:");
        acimaMedia(segunda, terça, quarta, quinta,
                sexta, sabado, domingo);

        System.out.println("\nDia mais quente:");
        diaMaisQuente(segunda, terça, quarta, quinta,
                sexta, sabado, domingo);

        scanner.close();
    }

    public static double media(double segunda, double terça,
            double quarta, double quinta, double sexta,
            double sabado, double domingo) {

        return (segunda + terça + quarta + quinta +
                sexta + sabado + domingo) / 7;
    }

    public static void acimaMedia(double segunda, double terça,
            double quarta, double quinta, double sexta,
            double sabado, double domingo) {

        double media = media(segunda, terça, quarta,
                quinta, sexta, sabado, domingo);

        if (segunda > media) {
            System.out.println("Segunda-feira: " + segunda);
        }

        if (terça > media) {
            System.out.println("Terça-feira: " + terça);
        }

        if (quarta > media) {
            System.out.println("Quarta-feira: " + quarta);
        }

        if (quinta > media) {
            System.out.println("Quinta-feira: " + quinta);
        }

        if (sexta > media) {
            System.out.println("Sexta-feira: " + sexta);
        }

        if (sabado > media) {
            System.out.println("Sábado: " + sabado);
        }

        if (domingo > media) {
            System.out.println("Domingo: " + domingo);
        }
    }

    public static void diaMaisQuente(double segunda, double terça,
            double quarta, double quinta, double sexta,
            double sabado, double domingo) {

        double maior = segunda;
        String dia = "Segunda-feira";

        if (terça > maior) {
            maior = terça;
            dia = "Terça-feira";
        }

        if (quarta > maior) {
            maior = quarta;
            dia = "Quarta-feira";
        }

        if (quinta > maior) {
            maior = quinta;
            dia = "Quinta-feira";
        }

        if (sexta > maior) {
            maior = sexta;
            dia = "Sexta-feira";
        }

        if (sabado > maior) {
            maior = sabado;
            dia = "Sábado";
        }

        if (domingo > maior) {
            maior = domingo;
            dia = "Domingo";
        }

        System.out.println(dia + ": " + maior + " graus");
    }
}