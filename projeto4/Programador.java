public class Programador extends Funcionario {

  public Programador(String nome, Funcionario superior) {
    super(nome, superior);
  }

  @Override
  public String tratarProblema(int id) {
    if (id == TIPO_PROBLEMA_CODIGO) {
      return "O problema de codigo foi resolvido pelo Programador: " + nome;
    } else {
      return getSuperior().tratarProblema(id);
    }
  }
}
