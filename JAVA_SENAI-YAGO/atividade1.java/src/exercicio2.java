import java.util.Scanner;
public class exercicio2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[4][3];
for (int l = 0; l < m.length; l++) {// leitura: dois laços
for (int c = 0; c < m[l].length; c++) {
System.out.print("Digite o valor da posição [" + l + "][" + c + "]: ");
m[l][c] = sc.nextInt();
    }
    }
    System.out.println("Matriz informada:");
    for (int l = 0; l < m.length; l++) {// exibição: linha por linha
    for (int c = 0; c < m[l].length; c++) {
    System.out.print(m[l][c] + "\t");
    }
    System.out.println();
    }
    int maior = m[0][0], menor = m[0][0];// começam no 1º elemento
    for (int l = 0; l < m.length; l++) {
    for (int c = 0; c < m[l].length; c++) {
    if (m[l][c] > maior) maior = m[l][c];
    if (m[l][c] < menor) menor = m[l][c];
    }
    }
    System.out.println("Maior: " + maior + " | Menor: " + menor);
    sc.close();
}
}






