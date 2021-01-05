public class Pessoa {
  protected static int kp;
  protected String nome;
  protected char sexo;
  protected int idade;

  public Pessoa() {
    this("", 'F', 0);
    kp = 0;
  }

  public Pessoa(String nome, char sexo, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
  }

  public void setKp() {
    kp++;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getKp() {
    return kp;
  }

  public String getNome() {
    return nome;
  }

  public char getSexo() {
    return sexo;
  }

  public int getIdade() {
    return idade;
  }
}
