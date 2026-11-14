import javax.swing.JOptionPane;
import java.util.Scanner;
public class ATIVIDADE1 {
    public static void main(String[] args) {
        int n1,expo,result=1;
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite o Primeiro Número:");
        n1=sc.nextInt();
        System.out.println("Digite o expoente:");
        expo=sc.nextInt();
        for (int i = 0; i < expo; i++) {
            result=result*n1;
        }
        System.out.println("O resultado é "+result);

            
        
        
    }

}
