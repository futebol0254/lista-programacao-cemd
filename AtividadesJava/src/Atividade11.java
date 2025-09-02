import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a idadeAnos : ");
        double idadeAnos  = leia.nextDouble();
        double idadeMeses  = idadeAnos * 12;
        System.out.println("O idadeMeses é: ");
    }
}
