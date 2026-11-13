import java.util.Scanner;
public class TrabalhoInteiro {
    public static void main(String[] args) {
         int num,antes,depois;
         Scanner ler=new Scanner(System.in);
         System.out.println("Digite o Numero:");
            num = ler.nextInt();
         antes = num - 1;
         depois = num + 1;
         System.out.println("O numero digitado é:"+num+" O numero antecessor é:"+antes+" O numero depois é:"+depois);
         
       


    }

}
