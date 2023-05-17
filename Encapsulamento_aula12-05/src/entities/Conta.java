package entities;

public class Conta {
	private int numeroDaConta;
	private int agencia;
	private String titular;
	private double saldo;
	
	//alt+shift+S para entrar no getters e setters
	
	/*
	//super sem parametro
	public Conta() {
		super();
	}
	
	
	// super com parametros "OBRIGA O USUÁRIO" a entrar com os dados
	public Conta(int numeroDaConta, int agencia, String titular) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.titular = titular;
		
	}*/
	
	
	
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
		return "\nNúmero da conta: "+ numeroDaConta + "\nAgência: " + agencia + "\nTitular:  " + titular + "\n "; // + saldo ;
	}
	 	
}
