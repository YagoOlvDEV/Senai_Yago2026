
import java.util.Scanner;

public class RemoverRepetidos7 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        // Lendo os 10 números
        for (int i = 0; i < 10; i++) {
            numeros[i] = leia.nextInt();
        }

        // Chamando o método para remover repetidos
        int[] resultado = removerRepetidos(numeros);

        // Mostrando os números sem repetição
        System.out.println("Números sem repetição:");

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
        // Chamando o método para mostrar os números repetidos
        mostrarRepetidos(numeros);

        leia.close();
    }

    public static int[] removerRepetidos(int[] numeros) {

        int[] numerosSemRepetidos = new int[numeros.length];
        int tamanho = 0;

        for (int i = 0; i < numeros.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < tamanho; j++) {

                if (numeros[i] == numerosSemRepetidos[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numerosSemRepetidos[tamanho] = numeros[i];
                tamanho++;
            }
        }

        int[] resultado = new int[tamanho];

        System.arraycopy(numerosSemRepetidos, 0, resultado, 0, tamanho);

        return resultado;
    }
    public static void mostrarRepetidos(int[] numeros) {

    System.out.println("Números repetidos:");

    for (int i = 0; i < numeros.length; i++) {

        boolean repetido = false;

        for (int j = 0; j < i; j++) {
            if (numeros[i] == numeros[j]) {
                repetido = true;
                break;
            }
        }

        if (repetido) {
            continue;
        }

        for (int j = i + 1; j < numeros.length; j++) {
            if (numeros[i] == numeros[j]) {
                System.out.println(numeros[i]);
                break;
            }
        }
    }
}
}
