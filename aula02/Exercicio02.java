import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Salário Bruto: ");
        double salarioBruto = entrada.nextDouble();

        double imposto;
        if (salarioBruto <= 2000.00) {
            imposto = 0;
        }
        else if (salarioBruto <= 4000.00) {
            imposto = salarioBruto * 0.075;
        }
        else if (salarioBruto <= 6000.00) {
            imposto = salarioBruto * 0.15;
        }
        else if (salarioBruto <= 10000.00) {
            imposto = salarioBruto * 0.225;
        }
        else {
            imposto = salarioBruto * 0.275;
        }
        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("Imposto = R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido = R$ %.2f\n", salarioLiquido);

        entrada.close();
    }
}