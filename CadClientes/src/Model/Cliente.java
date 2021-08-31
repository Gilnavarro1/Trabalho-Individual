package CadClientes.src.Model;

public class Cliente extends Pessoa {

  public String sintomas;

  public Cliente(String cpf, String nome, String endereço, String bairro, String cidade, String email, Integer idade,
      String sintomas) {
    super(cpf, nome, endereço, bairro, cidade, email, idade);
    this.sintomas = sintomas;

  }

  public String getSintomas() {
    return this.sintomas;
  }

  public void setSintomas(String sintomas) {
    this.sintomas = sintomas;
  }

}
