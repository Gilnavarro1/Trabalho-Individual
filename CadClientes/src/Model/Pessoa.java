package CadClientes.src.Model;

public abstract class Pessoa {

  private String cpf;
  private String nome;
  private String endereço;
  private String bairro;
  private String cidade;
  private String email;
  private Integer idade;

  public Pessoa(String cpf, String nome, String endereço, String bairro, String cidade, String email, Integer idade) {

    this.cpf = cpf;
    this.nome = nome;
    this.endereço = endereço;
    this.bairro = bairro;
    this.cidade = cidade;
    this.email = email;
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereço() {
    return endereço;
  }

  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }
}
