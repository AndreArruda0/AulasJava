
public class TestaClienteNaConta {
	
	public static void main(String[] args) {
		Conta conta2 = new Conta();
		conta2.agencia = 1234;
		conta2.numero = 232;
		conta2.deposita(200);
		conta2.titular = new Cliente();
		conta2.titular.nome = "Andre";
		System.out.println(conta2.titular.nome);
	}

}
