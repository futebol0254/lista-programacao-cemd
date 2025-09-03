import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double z = leia.nextDouble();

        if (z > 0) {
            System.out.println("Número positivo");
        } else if (z < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
