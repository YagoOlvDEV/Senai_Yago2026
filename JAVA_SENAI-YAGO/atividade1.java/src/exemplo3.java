import java.util.Scanner;
public class exemplo3 {
static double calcularMedia(double nota1, double nota2){
    double media = (nota1 + nota2) / 2;
    return media;

}
public static  void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   System.out.println("Digite a primeira nota: ");
   double nota1 = ler.nextDouble();
   System.out.println("Digite a segunda nota: ");
    double nota2 = ler.nextDouble();
    double media = calcularMedia(nota1, nota2);
    System.out.println("A media do aluno é: " + media);
    ler.close();
}


}