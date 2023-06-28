public class exec2 {
    public static void main(String[] args) {
        double nota1 = 5;
        double nota2 = 2;
        double media = (nota2 + nota2) /2;
        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Aluno em Final");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}
