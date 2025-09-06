import java.util.Scanner;
public class Atividade42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Números pares digitados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
