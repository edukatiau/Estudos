public class Usuario{

    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String newLogin){
        this.login = newLogin;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String newSenha){
        this.senha = newSenha;
    }

    @Override
    public String toString(){
        return "Usuario [name= " +nome+ ", login= " +login+ ", senha= " +senha+ "]";
    }

}