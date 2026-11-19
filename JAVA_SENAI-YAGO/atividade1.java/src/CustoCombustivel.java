import java.util.Scanner;
public class CustoCombustivel {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida em km: ");
        double distancia = ler.nextDouble();
        System.out.println("Digite o consumo do veiculo em km/l: ");
        double consumo = ler.nextDouble();
        System.out.println("Digite o preco do combustivel em R$: ");
        double precoCombustivel = ler.nextDouble();

        double custo = calcularCusto(distancia, consumo, precoCombustivel);
        System.out.printf("O custo total do combustivel é: R$ %.2f%n", custo);

        ler.close();
    }
    static double calcularCusto(double distancia, double consumo, double precoCombustivel){
        double litros = distancia / consumo;
        return litros * precoCombustivel;
    }


}
