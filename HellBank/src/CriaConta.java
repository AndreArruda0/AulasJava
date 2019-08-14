
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 178.50;
		System.out.println(primeiraConta.saldo);
		
		Conta seguntaConta = new Conta();
		seguntaConta.agencia = 1546;
		seguntaConta.numero = 666;
		seguntaConta.saldo = 9389.65;
		seguntaConta.titular = "André Galdino Arruda";
		System.out.println(seguntaConta.titular);
	}
}