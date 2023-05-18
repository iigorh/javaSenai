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
		if (saldo - (valor + 2) <= -150) {
			System.out.println("Limite do cheque especial excedido. (R$150.00)");
	        
	    } else {
	    	saldo -= valor + 2;
	    }
	}
}
	// até 150 reais negativo
	
