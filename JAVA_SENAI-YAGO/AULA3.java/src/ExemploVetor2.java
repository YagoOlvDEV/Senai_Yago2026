import java.util.Scanner;
public class ExemploVetor2 {
    public static void main(String[] args) {
    int[] numeros= new int[5];
    Scanner ler=new Scanner(System.in);
    
    for (int i = 0; i <5; i++) {
        System.out.println("Digite o numero:");
        numeros[i]=ler.nextInt();
    }
    System.out.println("Numeros digitados:");
    for (int num:numeros){
        System.out.println(num);
    }
    
        
}
}
