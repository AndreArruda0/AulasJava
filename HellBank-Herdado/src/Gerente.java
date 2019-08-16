
public class Gerente extends Funcionario {

	private int senha;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	


	public boolean senha(int senha) {
		if(this.senha== senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return (super.getBonificacao() + super.getSalario());
	}
	

}
