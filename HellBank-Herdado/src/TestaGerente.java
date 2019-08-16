
public class TestaGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Gustavo", "23456765456", 15000.00);
		gerente.setSenha(14576);
		boolean auth = gerente.senha(14576);
		System.out.println(gerente.getNome());
		System.out.println(auth);
		
		System.out.println(gerente.getBonificacao());
		
		Funcionario f = new Funcionario("Larissa", "34575689076", 1500.00);
		Segurança s = new Segurança("Rodolfo", "3546879087", 2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(gerente);
		controle.registra(f);
		controle.registra(s);
		
		System.out.println(controle.getSoma());
	}

}