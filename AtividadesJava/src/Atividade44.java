import java.util.Scanner;
public class Atividade44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite as 5 notas dos alunos:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[1] = leia.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Média da turma: " + media);
    }
}
