public class Empresa {

  public static void main(String[] args) {
    // Instanciando empregrados sem subordinados.
    Empregado Jose = new Empregado("José", 3000);
    Empregado Joana = new Empregado("Joana", 1500);
    Empregado Cris = new Empregado("Cris", 500);

    // Instanciando e adicionando subordinados correnspondentes de cada chefe.
    Chefe Marcos = new Chefe("Marcos", 1000);
    Marcos.addSubordinado(Cris);
    Chefe Joao = new Chefe("Joao", 2000);
    Joao.addSubordinado(Marcos);
    Joao.addSubordinado(Joana);
    Chefe Maria = new Chefe("Maria", 3000);
    Maria.addSubordinado(Jose);
    Maria.addSubordinado(Joao);    

    // Imprimindo salario agregado de Joao e Maria respectivamente.
    System.out.println("Salario Agregado de João é: " + Joao.getSalarioAgregado());
    System.out.println("Salario Agregado de Maria é: " + Maria.getSalarioAgregado());
  }
}
