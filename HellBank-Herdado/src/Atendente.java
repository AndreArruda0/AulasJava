
public class Atendente extends Funcionario {
	
	public Atendente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);

	}

	public double getBonificacao() {
		return (super.getBonificacao() + 100);
	}

}
