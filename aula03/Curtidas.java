import java.util.Scanner;
public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroPublicacoes;
        do {
            System.out.print("Número de Publicações: ");
            numeroPublicacoes = entrada.nextInt();
            if (numeroPublicacoes <= 0) {
                System.out.println("\tO número de publicações deve ser positivo.");
            }
        } while (numeroPublicacoes <= 0);

        int totalCurtidas = 0;
        for (int publicacao = 1; publicacao <= numeroPublicacoes; publicacao++) {
            System.out.printf("Número de curtidas %02d: ", publicacao);
            int qtdeCurtidas = entrada.nextInt();
            totalCurtidas += qtdeCurtidas; // totalCurtidas = totalCurtidas + qtdeCurtidas;
            if (qtdeCurtidas >= 100) {
                System.out.println("\tPublicação popular!");
            }
            else {
                System.out.println("\tPublicação com poucas curtidas.");
            }
        }

        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
        System.out.printf("Número de publicações: %d\n", numeroPublicacoes);
        System.out.printf("Quantidade total de curtidas: %d\n", totalCurtidas);
        System.out.printf("Média de curtidas: %.2f\n", mediaCurtidas);
    }
}