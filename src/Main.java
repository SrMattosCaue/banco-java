
public class Main {

	public static void main(String[] args) {
		Clientes caue = new Clientes();
		caue.setNome("Caue");
		
		Conta cc = new ContaCorrente(caue);
		Conta poupanca = new ContaPoupanca(caue);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
