public class Usuario{
    
    private String nome;
    private int idade;
    private String login;
    private String senha;
    
    public Usuario(){ //Construtor vazio

    }

    public Usuario(String n, int i, String l, String s){ //Construtor iniciando os atributos
        this.nome = n;
        this.idade = i;
        this.login = l;
        this.senha = s;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
            return idade;
        }

    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }

}