/**
 * Um conjunto de 5 máquinas tem sua capacidade máxima de produção 
 * armazenada em um vetor (vetor capacidade) e sua produção efetiva registrada 
 * em outro vetor (vetor produção). O programa deve:
 *  - Calcular a eficiência de cada máquina (produção / capacidade * 100%);
 *  - Armazenar em um outro vetor se a máquina está com operação normal ou 
 *    está operando abaixo de 70% de eficiência.
 * Ao final, apresentar todas as informações na tela.
 */

public class AnaliseEficiencia {
    public static void main(String[] args) {
        int[] capacidade = {500, 200, 300, 435, 175};
        int[] producao = {480, 70, 275, 125, 150};
        String[] status = statusMaquina(capacidade, producao);
        imprime(capacidade, producao, status);
    }

    public static String[] statusMaquina(int[] capacidade, int[] producao) {
        double eficiencia;
        String[] status = new String[capacidade.length];
        for (int i = 0; i < capacidade.length; i++) {
            eficiencia = (double) producao[i] / capacidade[i];
            if (eficiencia >= 0.7) {
                status[i] = "NORMAL";
            }
            else {
                status[i] = "ABAIXO";
            }
        }
        return status;
    }

    public static void imprime(int[] capacidade, int[] producao, String[] status) {
        for (int i = 0; i < capacidade.length; i++) {
            System.out.printf("%5d ", capacidade[i]);
            System.out.printf("%5d ", producao[i]);
            System.out.printf("%10s\n", status[i]);
        }
    }
}
