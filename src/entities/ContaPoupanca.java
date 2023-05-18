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
		if(saldo <= 0 && saldo - valor <= 0) {
			System.out.println("Saldo insuficiente! Você não tem cheque especial contratado.");
			
		}else {
			saldo -= valor +5;
		}
	}
	
	
}


//n pode ficar negativa