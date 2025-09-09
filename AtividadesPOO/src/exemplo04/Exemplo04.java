package exemplo04;
import java.util.Scanner;
public class Exemplo04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Usuario user = new Usuario("Victor",21,"Bilboseiro","2334445555");

        user.falar();
    }
}
