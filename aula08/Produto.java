public class Produto {
    // atributos
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private int quantidadeEstoque;

    // construtor
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        setPrecoVenda(precoVenda);
        this.quantidadeEstoque = 0;
    }

    // métodos
    public void registrarEntrada(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque = quantidadeEstoque + quantidade;
        }
    }

    public boolean registrarSaida(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            return false;
        }
        quantidadeEstoque = quantidadeEstoque - quantidade;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%-10s|%5.2f|%5.2f|%2d", nome, precoCusto,
            precoVenda, quantidadeEstoque);
    }


    // métodos getters e setters
    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= this.precoCusto) {
            this.precoVenda = precoVenda;
        }
        else {
            this.precoVenda = this.precoCusto;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
        
    }


    
}
