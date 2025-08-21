public class AtividadeSala02 {

    public static void main(String[] args){
        String nome = "Carlos";
        String sobrenome = "Eduardo";
        int idade = 20;
        double peso = 57;
        double altura = 1.9;
        double imc = 0;

        System.out.println(nome + " " + sobrenome);

        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento: " + anoNasc);

        String txtPesoAltura = "Peso: " + peso + "; Altura: " + altura;
        System.out.println(txtPesoAltura);

        imc = peso/(altura*altura);
        System.out.println("Base calc IMC: " +peso+"/"+altura+"² = " + imc);
    }
}