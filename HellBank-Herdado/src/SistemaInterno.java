
public class SistemaInterno {
	
	private int senha = 666;
	
	public void autentica(Autenticavel f) {
		boolean resultado = f.senha(this.senha);
		if(resultado) {
			System.out.println("Bem Vindo!");
		} else {
			System.out.println("Usuario e senha incorretos !");
		}
	}

}
