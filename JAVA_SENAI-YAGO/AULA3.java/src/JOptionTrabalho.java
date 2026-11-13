import javax.swing.JOptionPane;
import java.util.Scanner;
public class JOptionTrabalho {
    public static void main(String[] args) {
        String nome,email,n1;
        double aumento=0.10;
        
        Scanner ler=new Scanner(System.in);
        nome=JOptionPane.showInputDialog("Digite seu nome:");
        email=JOptionPane.showInputDialog("Digite seu email:");
        n1=JOptionPane.showInputDialog("Digite seu Salario:");
        double salario=Double.parseDouble(n1);
        salario=(salario*aumento)+salario;
        JOptionPane.showMessageDialog(null,"seu nome é:"+nome+"\nSeu email é:"+email+"\nSeu sálario é:"+salario);
        
       
       
    }

}
