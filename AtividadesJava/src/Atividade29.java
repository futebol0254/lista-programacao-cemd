import java.util.Scanner;
public class Atividade29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("1 – Somar");
        System.out.println("2 – Subtrair");
        System.out.println("3 – Multiplicar");
        System.out.println("4 – Dividir");
        int opcao = leia.nextInt();

        System.out.println("Digite o primeiro númeo: ");
        double num1 = leia.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = leia.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
        }
    }
}
