
public class Seguranša extends Funcionario {
	
	public Seguranša(String nome, String cpf, double salario) {
		super(nome, cpf, salario);

	}

	public double getBonificacao() {
		return 200;
	}

}
