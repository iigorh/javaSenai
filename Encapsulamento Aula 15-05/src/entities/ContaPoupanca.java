package entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String titular, int numeroDaConta, int agencia) {
		super(titular, numeroDaConta, agencia);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor + 5;
	}
	
	
}
