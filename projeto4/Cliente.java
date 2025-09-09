public class Cliente {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Funcionario funcionario = criaEncadeamento();
    String message = funcionario.tratarProblema(
      funcionario.TIPO_PROBLEMA_CUSTO
    );
    System.out.println(message);
  }

  //implemente o método criaEncadeamento

  public static Funcionario criaEncadeamento() {
    Funcionario atila = new Diretor("Atila");
    Funcionario americo = new Gerente("Americo", atila);
    Funcionario gabriel = new Programador("Gabriel", americo);
    return gabriel;
  }
}
