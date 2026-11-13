public class ExemploVetor {
    public static void main(String[] args) {
        String[] frutas = {"laranja","Manga","Uva","Carambola","Morango"};
        for (int i = 0; i <5; i++) {
            System.out.println ("Fruta["+i+"]:"+frutas[i]);
        }
        System.out.println("-------------------------------");
        for (String fruta : frutas) {
            System.out.println(fruta);
            
        }
            
    }

}
