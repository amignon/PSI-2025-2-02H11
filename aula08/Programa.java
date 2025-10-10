public class Programa {
    public static void main(String[] args) {
        Produto p = new Produto("Caneta", 3.50, 5.20);
        p.registrarEntrada(3);
        System.out.println(p);
        boolean retirouEstoque = p.registrarSaida(10);
        if (retirouEstoque) {
            System.out.println("Realizou baixa no estoque");
        }
        else {
            System.out.println("Quantidade de retirada acima do estoque");
        }
        
    }
}
