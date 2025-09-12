import java.util.Scanner;
public class ExemploVetor {
    public static void main(String[] args) {
        int[] numeros = criaVetor(7);
        System.out.println("*** VETOR ORIGINAL ***");
        imprimeVetor(numeros);
        int quantidade = modificaVetor(numeros);
        System.out.println("*** VETOR MODIFICADO ***");
        imprimeVetor(numeros);
        System.out.printf("Quantidade de modificações: %d\n", quantidade);
    }

    public static int modificaVetor(int[] vetor) {
        int qtde = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 10 && vetor[i] <= 20) {
                vetor[i] = 0;
                qtde++;
            }
        }
        return qtde;
    }

    public static int[] criaVetor(int n) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor %d: ", i + 1);
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println();
    }
}
