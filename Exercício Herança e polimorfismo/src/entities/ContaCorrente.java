package entities;

public class ContaCorrente extends Conta{
// extends para reaproveitar c�digo e alt+shift+s "from superclass" para herdar
	
	
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
		if (saldo - (valor - 5) <= -150) {
	        saldo -= valor + 5;
	    } else {
	        System.out.println("Limite do cheque especial excedido. (R$150.00)");
	    }
	}
}
	// at� 150 reais negativo
	

