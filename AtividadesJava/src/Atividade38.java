import java.util.Scanner;
public class Atividade38 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = leia.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * 1;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
