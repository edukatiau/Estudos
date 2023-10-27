import java.util.ArrayList;

public class Usuario{

    private String nome;
    private String login;
    private String senha;
    private ArrayList<Veiculo> meusVeiculos = new ArrayList<Veiculo>();



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

    public ArrayList<Veiculo> getMeusVeiculos() {
      return meusVeiculos;
    }
  
    public void addMeusVeiculos(Veiculo veiculo) {
      this.meusVeiculos.add(veiculo);
    }

    public void deleteMeusVeiculos(){
      this.meusVeiculos.clear();
    }
  
    @Override
    public String toString(){
        return "Usuario [name= " +nome+ ", login= " +login+ ", senha= " +senha+ "]";
    }

}
