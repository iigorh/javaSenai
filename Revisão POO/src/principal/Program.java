package principal;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		
		conta.setTitularConta("Igor H.");
		conta.setNumeroConta(4321);
		conta.setAgencia(6789);
		conta.depositar(200.25);
		conta.mostraDadosDaConta();
		conta.sacar(200.00);
		conta.mostraDadosDaConta();

		

	}

}
