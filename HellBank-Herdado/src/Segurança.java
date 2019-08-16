
public class Segurança extends Funcionario {
	
	public Segurança(String nome, String cpf, double salario) {
		super(nome, cpf, salario);

	}

	public double getBonificacao() {
		return 200;
	}

}
