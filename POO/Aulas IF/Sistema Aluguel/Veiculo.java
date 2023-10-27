public class Veiculo{
  private String marca;
  private String modelo;
  private String cor;
  private String ano;
  private Usuario proprietario;
  private boolean disponivel;
  private boolean alugado;
  private Usuario locatario;
  private double valorDiaria;

  public Veiculo(final String marca, final String modelo, final String cor, final String ano, final Usuario proprietario){
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
    this.proprietario = proprietario;
    this.disponivel = false;
    this.alugado = false;
    this.locatario = new Usuario("","","");
    this.valorDiaria = 10.0;
  }

  public String getMarca() {
  	return marca;
  }
  
  public void setMarca(String marca) {
  	this.marca = marca;
  }
  
  public String getModelo() {
  	return modelo;
  }
  
  public void setModelo(String modelo) {
  	this.modelo = modelo;
  }
  
  public String getCor() {
  	return cor;
  }
  
  public void setCor(String cor) {
  	this.cor = cor;
  }
  
  public String getAno() {
  	return ano;
  }
  
  public void setAno(String ano) {
  	this.ano = ano;
  }
  
  public Usuario getProprietario() {
  	return proprietario;
  }
  
  public void setProprietario(Usuario proprietario) {
  	this.proprietario = proprietario;
  }
  
public boolean isDisponivel() {
	return disponivel;
}

public void setDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
}

public boolean isAlugado() {
	return alugado;
}

public void setAlugado(boolean alugado) {
	this.alugado = alugado;
}

public Usuario getLocatario() {
	return locatario;
}

public void setLocatario(Usuario locatario) {
	this.locatario = locatario;
}

public double getValorDiaria() {
	return valorDiaria;
}

public void setValorDiaria(double valorDiaria) {
	this.valorDiaria = valorDiaria;
}

@Override
public String toString() {
	return "Veiculo [marca= " + marca + ", modelo= " + modelo + ", cor= " + cor + ", ano= " + ano + ", proprietario= " + proprietario.getNome() + ", disponivel= " + disponivel + ", alugado= " + alugado + ", locatario= " + locatario.getNome() + ", valorDiaria= " + valorDiaria + "]";
}

}
