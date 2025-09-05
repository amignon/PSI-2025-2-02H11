import java.util.Scanner;
public class TracoMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declara e inicializa a matriz
        int[][] matriz = new int[5][5];

        // popula a matriz
        for (int i  = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        // percorre a matriz e calcula o traco
        int traco = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
                if (i == j) {
                    traco = traco + matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.printf("Traço da Matriz: %d\n", traco);
    }
}
