package entities;

public class Conta {

		/* 
		 * Ordem de visualiza��o ou declara��o:
		 * 1� atributos
		 * 2� construtores da classe
		 * 3� m�todos get e set
		 * 4� m�todos (fun��es) necess�rio;
		 */
	
	
	
		//ATRIBUTOS
		private String titularConta;
		private int agencia;
		private int numeroConta;
		protected double saldo; //mudado de private para protected para que possa ser acess�vel nas subclasses
		
	
		
		
		
		
		//get e set serva para permitir acesso aos atributos privados
		public String getTitularConta() {
			return titularConta;
		}
		
		//CONSTRUTORES
		public Conta() {
			super ();
		}
		public Conta(String titularConta, int agencia, int numeroConta) {
			super();
			this.titularConta = titularConta;
			this.agencia = agencia;
			this.numeroConta = numeroConta;
		}
		public void setTitularConta(String titularConta) {
			this.titularConta = titularConta;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		
		//M�TODOS (preferencia por nomes de verbos no imperativo
		// "parametro()" � uma vari�vel que precisa ser recebido de outra classe, (precisa ser passado)
		public void depositar(double quantiaEmReais) {
			saldo += quantiaEmReais;
		}
		
		public void sacar (double quantiaEmReais) {
			saldo -= quantiaEmReais;
		}
		
		public void mostraDadosDaConta() {
			System.out.println("Nome do titular: " + getTitularConta());
			System.out.println("Ag�ncia: " + getAgencia());
			System.out.println("Conta: " + getNumeroConta());
			System.out.println("Saldo: " + getSaldo());
		}
	
		
		
		
	
}
