import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = leia.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = leia.nextDouble();

        double media = (n1 + n2 + n3) /3;
        System.out.println("A média é: , media ");
    }
}
