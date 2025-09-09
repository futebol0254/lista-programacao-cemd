package exemplo04;

public class Usuario extends Pessoa{
    private String userName;
    private String passWord;


    public Usuario(){
        super();
    }
    public Usuario(String nome, int idade, String userName, String passWord){
        super(nome, idade);
        this.userName = userName;
        this.passWord = passWord;
    }



    public void falar() {
        System.out.println("Oi, eu sou " + this.getNome() + ". Eu tenho " + this.getIdade() + " anos de idade.");
        System.out.println("Meu nome de usuário na Steam é: " + this.userName);
    }



}