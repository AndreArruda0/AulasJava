
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Pedro";
		paulo.CPF = "34576578976";
		paulo.profissao = "Programador";
		
		Conta conta1 = new Conta();
		conta1.deposita(100);
		
		conta1.titular = paulo;
		System.out.println(conta1.titular.nome);
	}

}
