import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float media1,soma1;
        
        System.out.println("Bem vindo a seu boletim:");
        System.out.println("Digite a sua primeira nota:");
        float nota1 = leitura.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        float nota2 = leitura.nextFloat();
        
        soma1=nota1+nota2;
        media1=soma1/2;
        
        System.out.println("Sua média é:"+media1);

        
    }

}
