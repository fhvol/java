public class exec1 {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 7;
        double media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media < 4){
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno em recuperação");
        }
    }
}
