
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(666);
		System.out.println(conta.saldo);
		
		boolean resultado =  conta.saca(100);
		System.out.println(conta.saldo);
		System.out.println(resultado);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		System.out.println(conta2.saldo);
		boolean resultTransf = conta2.transfere(300, conta);
		if(resultTransf) {
			System.out.println("Transferencia realizada com sucesso !");
			System.out.println("o saldo da Conta1 ficou " + conta.saldo);
			System.out.println("o saldo da Conta2 ficou " + conta2.saldo);			
		} else {
			System.out.println("Sem saldo suficiente para realizar a transferencia !");
		}

		
	}

}
