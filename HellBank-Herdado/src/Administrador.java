
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;

	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean senha(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
