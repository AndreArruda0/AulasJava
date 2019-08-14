
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 200;
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
	}

}