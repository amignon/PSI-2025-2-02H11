public class Circulo {
    private double raio;
    private Ponto centro;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public boolean estaContido(Ponto p) {
        double distancia = centro.distancia(p);
        return distancia <= raio;
    }
    
}
