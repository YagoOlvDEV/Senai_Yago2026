import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int[] numeros={20,40,60,10,30,50,100};
        int numero;
        do {
            boolean achei=false;
           System.out.println("Digite o Número:");
           numero=sc.nextInt(); 
           for (int i = 0; i < numeros.lenght; i++) {
                if (numero==numeros[i]) {
                    achei= true;
                    break;
                    
                }          
           }


        } while (numero !=0);
        System.out.println("Encerrando o programa!");
       
    }
}
