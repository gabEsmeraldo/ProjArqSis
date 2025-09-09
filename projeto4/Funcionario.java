public abstract class Funcionario implements TratarProblema {

  protected String nome;
  private Funcionario superior;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Funcionario getSuperior() {
    return superior;
  }

  public void setSuperior(Funcionario superior) {
    this.superior = superior;
  }

  public Funcionario(String nome) {
    this.nome = nome;
  }

  public Funcionario(String nome, Funcionario superior) {
    this.nome = nome;
    this.superior = superior;
  }

  public final int TIPO_PROBLEMA_CODIGO = 1;
  public final int TIPO_PROBLEMA_PRAZO = 2;
  public final int TIPO_PROBLEMA_CUSTO = 3;
  public final int TIPO_PROBLEMA_OUTRO = 4;
}
