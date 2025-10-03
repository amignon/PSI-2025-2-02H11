public class Aluno {
    // atributos
    String nome;
    double nota1;
    double nota2;

    // construtor
    public Aluno (String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nome) {
        this.nome = nome;
        nota1 = 0.0;
        nota2 = 0.0;
    }

    // métodos
    public double calculaMedia() {
        double soma = nota1 + nota2;
        return soma / 2.0;
    }

    public void exibeInfo() {
        System.out.printf("%-20s", nome);
        System.out.printf("|%4.1f", nota1);
        System.out.printf("|%4.1f\n", nota2);
    }
}
