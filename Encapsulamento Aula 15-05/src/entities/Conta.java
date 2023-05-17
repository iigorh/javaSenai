package entities;

public class Conta {
	private String titular;
	private int numeroDaConta;
	private int agencia;
	protected double saldo;
		//protected para acessar nas  subclasses, mas continuar privado para classes de fora
	public Conta() {
		super();
	}
	
	public Conta(String titular, int numeroDaConta, int agencia) {
		super();
		this.titular = titular;
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public void depositar(double valor) {
		saldo += valor; //atualizar saldo ele mesmo + um valor
	}
	public void sacar(double valor) {
		if (valor > saldo){
			System.out.println("Saldo insuficiente!");
		}
		else {
			saldo -= valor;
		}

	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitular da conta: " + titular + "\nN�mero da conta: " + numeroDaConta + "\nAg�ncia: " + agencia + "\nSaldo: " + saldo ;
	}
	 	
}


