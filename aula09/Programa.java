import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ponto p1 = new Ponto(2, 1);
        
        System.out.println("Informe sua localização");
        System.out.print("X: ");
        int x = entrada.nextInt();
        System.out.print("Y: ");
        int y = entrada.nextInt();
        System.out.print("Raio: ");
        double r = entrada.nextDouble();

        Ponto p = new Ponto(x, y);
        double d = p.distancia(p1);
        System.out.println(d);

        Circulo c = new Circulo(p, r);
        boolean contido = c.estaContido(p1);
        System.out.println(contido);
    }
}
