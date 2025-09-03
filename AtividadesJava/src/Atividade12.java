import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        int x = leia.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = leia.nextInt();

        if (y == 0) {
            System.out.println("Erro: divisão por zero não é permitido.");
        } else {
            int quociente = x / y;
            int resto = x % y;

            System.out.println("Quociente (x / y) = " + quociente);
            System.out.println("Resto (x % y) = " + resto);
        }
    }
}
