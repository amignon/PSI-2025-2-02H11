import java.util.ArrayList;
public class ListaPontos {
    ArrayList<Ponto> pontos;

    public ListaPontos() {
        pontos = new ArrayList<Ponto>();
    }

    public void adicionaPonto(Ponto p) {
        pontos.add(p);
    }

    public ArrayList<Ponto> pontosProximos(Circulo c) {
        ArrayList<Ponto> proximos = new ArrayList<>();
        for (Ponto p : pontos) {
            if (c.estaContido(p)) {
                proximos.add(p);
            }
        }
        return proximos;
    }
}
