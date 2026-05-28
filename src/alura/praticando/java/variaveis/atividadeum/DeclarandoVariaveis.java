package alura.praticando.java.variaveis.atividadeum;

public class DeclarandoVariaveis {
    public static void main(String[] args) {
       String nome = "Guilherme";
       int idade = 22;
       double altura = 1.78;
       boolean estudante = true;

        System.out.format("""
                Aluno: %s
                Idade: %d
                Altura: %.2f
                Estudante: %s%n
                """, nome, idade, altura, estudante);
    }
}