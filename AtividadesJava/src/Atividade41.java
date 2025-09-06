import java.util.Scanner;
public class Atividade41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i <5; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}
