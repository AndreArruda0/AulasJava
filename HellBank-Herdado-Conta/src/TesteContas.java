public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente CC = new ContaCorrente(111, 111);
		CC.deposita(100);
		
		ContaPoupanca CP = new ContaPoupanca(222, 222);
		CP.deposita(200);
		
		CC.transfere(10, CP);
		
		System.out.println("Saldo da Conta Corrente : " + CC.getSaldo());
		System.out.println("Saldo da Conta Poupança : " + CP.getSaldo());
		
	}

}