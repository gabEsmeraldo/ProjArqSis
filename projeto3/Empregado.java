public class Empregado extends Funcionario {

    public Empregado(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public float getSalarioAgregado(){
        return this.salario;
    }
    @Override
    public void addSubordinado(Funcionario Emp){}
}
