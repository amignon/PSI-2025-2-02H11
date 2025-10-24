public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto p) {
        double soma = Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2);
        return Math.sqrt(soma);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
