public class Apresentacao {
    public static void main(String[] args) {
        String nome = "Fabiano";
        String sobrenome = "Oliveira";
        int idade = 41;
        double altura = 1.72;
        System.out.println("Meu nome é " + nome + " " + sobrenome + " e eu tenho " + idade + " " + "anos");
        System.out.println("Meu nome é %s %s, eu tenho %d anos e minha altura é de %.2f".formatted(nome, sobrenome, idade, altura));
        //%s -> String
        //%f -> Double
        //%d -> Int
    }
}
