import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double[] numeros =new double[10];
        int soma=0;
        Scanner leia=new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            System.out.println("Escreva seus números:");
            numeros[i]= leia.nextDouble();
        }
        
        System.out.println("Numeros pares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2==0)
                System.out.println(numeros[i]);
        }
        
        System.out.println("Numeros impares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2 !=0)
                System.out.println(numeros[i]);
            soma+= numeros[i];
            
        }
        System.out.println("A soma dos seus numeros são:" +soma);
        
    } }