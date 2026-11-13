public class Exemploformatacao {               //%S	String
                                                //%d Inteiros (int, long, short, byte)
                                                //%f Ponto flutuante (float, double)
                                                //%e ou %E	Ponto flutuante em notação científica
                                                //%b ou %B	Booleano (boolean)
                                                //%c ou %C	Caractere (char)
                                                //%.2f — Exibe exatamente 2 casas decimais (ex: 10.567 vira 10.57
                                                //%.0f — Exibe o número arredondado sem casas decimais (ex: 10.5 vira 11).
    public static void main(String[] args) {
        String nome="Yago";
        int idade=23;
        double altura=1.89;
        String email="yago@gmail.com";
        System.out.printf("%s tem %d anos e altura %.2f e o email é: %s",nome,idade,altura,email);
    }

}
