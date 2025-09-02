import java.util.ArrayList;

public class Chefe extends Funcionario {

  protected float salarioAgregado;
  private ArrayList<Funcionario> subordinados = new ArrayList<>();

  public Chefe(String nome, float salario) {
    super(nome, salario);
  }

  @Override
  public float getSalarioAgregado() {
    salarioAgregado = 0;
    for (Funcionario fun : subordinados) {
      salarioAgregado += fun.getSalarioAgregado();
    }
    return salarioAgregado + salario;
  }

  @Override
  public void addSubordinado(Funcionario emp) {
    subordinados.add(emp);
  }

  public void removeSubordinado(Funcionario emp) {
    subordinados.remove(emp);
  }

  public ArrayList<Funcionario> getFilhos() {
    return subordinados;
  }

  public void exibirNomeFilhos() {
    for (Funcionario funcionario : subordinados) {
      System.out.println(funcionario.getNome());
    }
  }
}
