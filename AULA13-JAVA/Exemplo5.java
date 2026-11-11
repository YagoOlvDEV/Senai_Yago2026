public class Exemplo5{
    public static void main (String[] args){
        char resposta='s';
        int quantidadeDiasMes=31;
    
        
    
    if (quantidadeDiasMes<30){
        System.out.println("O mes é fevereiro");
    }else{
        System.out.println("o mes é diferente de fevereiro");
    } 
    System.out.println(quantidadeDiasMes<30?"O mes é fevereiro:":"Não é fevereiro");
}
}