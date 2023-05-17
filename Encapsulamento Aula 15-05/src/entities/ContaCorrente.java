package entities;

public class ContaCorrente extends Conta{
// extends para reaproveitar código e alt+shift+s "from superclass" para herdar
	
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titular, int numeroDaConta, int agencia) {
		super(titular, numeroDaConta, agencia);
		// TODO Auto-generated constructor stub
	}
	
	@Override
		public void sacar(double valor) {
		saldo -= valor + 2;
		//"juros" sobrescrever, caso não tenha subscrição utilizara o mesmo da "Conta"
		}
	
	
}
