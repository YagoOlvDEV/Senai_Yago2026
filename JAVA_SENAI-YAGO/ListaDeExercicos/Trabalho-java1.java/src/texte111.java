import java.util.Scanner;
public class texte111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a primeira nota: ");
    double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota");
        double nota2 = sc.nextDouble();

        double notaMedia = (nota1 + nota2) / 2;
        System.out.printf("Media %.2f%n" , notaMedia);

        if (notaMedia >=7) {
             System.out.printf("Aprovado");
    } else {
        System.out.printf("Reprovado");
    }
        sc.close();
        
    }
}


