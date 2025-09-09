package exemplo03;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Diego", 31);
        pessoa.falar();

        pessoa.setIdade(32);

        System.out.println("Correção, minha idade é " + pessoa.getIdade());
        String nomeAnterior = pessoa.getNome();
        pessoa.setNome("Michael");
        System.out.println("Nome anterior: " + nomeAnterior);
        System.out.println("Novo nome: " + pessoa.getNome());
        pessoa.falar();
    }
}
