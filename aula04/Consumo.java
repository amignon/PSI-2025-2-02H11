import java.util.Scanner;
public class Consumo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declara o vetor e inicializa o vetor
        double[] consumos = new double[5];
        // popula o vetor
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo #%d: ", i + 1);
            consumos[i] = entrada.nextDouble();
        }
        // percorre o vetor
        int qtde = 0;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > 5000.0) {
                System.out.printf("Consumo %d anomalo: %.2f\n", i + 1, consumos[i]);
                qtde++;
            }
        }
        System.out.printf("Total de consumos anomalos: %d\n", qtde);
        entrada.close();
    }
}