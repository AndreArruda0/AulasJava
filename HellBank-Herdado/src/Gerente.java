
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
		// TODO Auto-generated constructor stub
	}
	



	
	public double getBonificacao() {
		return super.getSalario();
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
