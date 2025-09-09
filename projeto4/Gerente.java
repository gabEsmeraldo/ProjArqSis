public class Gerente extends Funcionario {

  public Gerente(String nome, Funcionario superior) {
    super(nome, superior);
  }

  @Override
  public String tratarProblema(int id) {
    if (id == TIPO_PROBLEMA_PRAZO) {
      return "O problema de Prazo foi resolvido pelo Gerente: " + nome;
    } else {
      return getSuperior().tratarProblema(id);
    }
  }
}
