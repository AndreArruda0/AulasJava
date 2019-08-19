
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total;
	
	public Conta(int agencia, int numero) {
		setAgencia(agencia);
		setNumero(numero);
		total++;
		System.out.println("o total de contas é : " + total);
	}
	
	public static int getTotal() {
		return total;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}