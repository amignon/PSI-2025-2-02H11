public class TestaAluno {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno("Ale", 6.5, 7.0);
        umAluno.exibeInfo();

        Aluno outroAluno = new Aluno("Mignon");
        outroAluno.exibeInfo();


        /*
        Aluno a = new Aluno();
        a.nome = "Ale";
        a.nota1 = 6.5;
        a.nota2 = 7.0;
        a.exibeInfo();
        double mediaA = a.calculaMedia();
        System.out.printf("Média: %.1f\n", mediaA);

        Aluno a2 = new Aluno();
        a2.nome = "Mignon";
        a2.nota1 = 5.0;
        a2.nota2 = 3.5;
        a2.exibeInfo();
        double mediaA2 = a2.calculaMedia();
        System.out.printf("Média: %.1f\n", mediaA2);
        */
    }
    
}
