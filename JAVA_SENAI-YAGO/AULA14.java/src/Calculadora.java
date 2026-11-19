import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        double num1,num2, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("//-------------------------------------//");
        System.out.println("Bem vindo a calculadora Senai!");
        System.out.println("//-------------------------------------//");
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();
        System.out.println("Escolha uma das operações abaixo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = ler.nextInt();
        switch(opcao){
            case 1:
                resultado = somar(num1,num2);
                System.out.printf("O resultado da soma é: %.2f%n\n", resultado);
                break;
            case 2:
                resultado = subtrair(num1,num2);
                System.out.printf("O resultado da subtração é: %.2f%n\n", resultado);
                break;
            case 3:
                resultado = multiplicar(num1,num2);
                System.out.printf("O resultado da multiplicação é: %.2f%n\n", resultado);
                break;
            case 4:
                if(num1 == 0){
                    System.out.println("Não é possível dividir por zero!");
                }
                 if(num2 == 0){
                    System.out.println("Não é possível dividir por zero!");
                }else{
                    resultado = dividir(num1,num2);
                    System.out.printf("O resultado da divisão é: %.2f%n\n", resultado);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.printf("O resultado da soma é: " + somar(num1,num2));
        System.out.printf("O resultado da subtração é: " + subtrair(num1,num2));
        System.out.printf("O resultado da multiplicação é: " + multiplicar(num1,num2));
        System.out.printf("O resultado da divisão é: " + dividir(num1,num2));
        ler.close();
    }
public static double somar(double soma1, double soma2){
    return soma1 + soma2;

}
public static double subtrair(double sub1, double sub2){
    return sub1 - sub2;
}
public static double multiplicar(double mult1, double mult2){
    return mult1 * mult2;

}
public static double dividir(double div1, double div2){
    return div1 / div2;

}
}
