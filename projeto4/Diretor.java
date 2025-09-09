public class Diretor extends Funcionario {

  public Diretor(String nome) {
    super(nome);
  }

  @Override
  public String tratarProblema(int id) {
    if (id == TIPO_PROBLEMA_CUSTO) {
      return "O problema de Custo foi resolvido pelo Diretor: " + nome;
    } else {
      return (
        "Entre em contato com o Diretor: " +
        nome +
        ", para a resolução de seu problema."
      );
    }
  }
}
