
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234,321);
		System.out.println(conta.getAgencia());
		
		int numero = conta.getNumero();
		System.out.println(numero);
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		conta.getTitular().setCPF("3457657845");
		System.out.println(conta.getTitular().getCPF()); 
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setNome("Andre");
		String nome = titularDaConta.getNome();
		System.out.println(nome);
		
		Conta conta2 = new Conta(1234,321);
		
		System.out.println(Conta.getTotal());
	}

}
