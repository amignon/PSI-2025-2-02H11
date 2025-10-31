import java.util.ArrayList;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        ListaPontos lista = new ListaPontos();
        Ponto p2 = new Ponto(3, 3);
        lista.adicionaPonto(p2);
        lista.adicionaPonto(new Ponto(3, 8));
        lista.adicionaPonto(new Ponto(10, 20));
        lista.adicionaPonto(new Ponto(2, 3));
        lista.adicionaPonto(new Ponto(1, 2));

        Ponto p = new Ponto(1, 1);
        Circulo c = new Circulo(p, 2);
        ArrayList<Ponto> proximos = lista.pontosProximos(c);
        System.out.println("*** Pontos Próximos ***");
        for (Ponto ponto : proximos) {
            System.out.println(ponto);
        }
    }
}
