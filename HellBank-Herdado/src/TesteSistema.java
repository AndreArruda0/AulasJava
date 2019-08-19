
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente("Lucas", "34565467567", 1500, 666);
		
		Cliente c = new Cliente();
		c.setSenha(666);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		SistemaInterno sic = new SistemaInterno();
		sic.autentica(c);
	}

}
