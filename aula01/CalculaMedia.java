import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média = %.1f\n", media);

        entrada.close();
    }
}