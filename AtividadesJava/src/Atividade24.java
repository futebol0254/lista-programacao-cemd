import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = leia.nextDouble();

        double quadrado = numero * numero;

        if (quadrado > 100) {
            System.out.println("Quadrado calculado");
        } else {
            System.out.println("Quadrado pequeno ou igual a 100");
        }
    }
}
