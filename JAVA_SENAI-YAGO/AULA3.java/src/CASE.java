import java.util.Scanner;
public class CASE {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.println("Digite o seu time:");
        String time=leitura.nextLine();

        String resultado=switch(time){
            case "Flamengo","Vasco","Botafogo","Fluminense" -> "RJ";
            case "Cruzeiro","AtleticoMG","AmericaMG" -> "MG";
            case "Palmeiras","santos","Mirassol" -> "SP";
            default -> "Outro Estado";
        };
        System.out.println("Resposta:"+resultado);
            
    }

}
        
        

