
import java.util.Scanner;

public class ehPar {

    static boolean ehPar(int numero){
    if(numero % 2 == 0){
    return true;
    }else{
    return false;
    }

    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();
    scanner.close();
    boolean par = ehPar(numero);
    System.out.println("O número " + numero + " é par? " + par);

    }

}