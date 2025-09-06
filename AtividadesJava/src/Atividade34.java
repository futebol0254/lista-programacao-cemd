import java.util.Scanner;
public class Atividade34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();

        int i = 0;
        while (i <= numero) {
            System.out.println(i);
        }
        i++;
    }
}
