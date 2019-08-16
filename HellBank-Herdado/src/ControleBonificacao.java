
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double bonif = f.getBonificacao();
		this.soma += bonif;

	}
	
	public double getSoma() {
		return soma;
	}

}
