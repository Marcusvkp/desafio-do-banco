
public class Main {

	public static void main(String[] args) {
		Cliente marcus = new Cliente();
		marcus.setNome("Marcus");
		
		Conta cc = new ContaCorrente(marcus);
		Conta poupanca = new ContaPoupanca(marcus);
		
		cc.transferir(100, poupanca);
		cc.depositar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
