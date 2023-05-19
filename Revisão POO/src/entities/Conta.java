package entities;

public class Conta {

		/* 
		 * Ordem de visualização ou declaração:
		 * 1º atributos
		 * 2º construtores da classe
		 * 3º métodos get e set
		 * 4º métodos (funções) necessário;
		 */
	
	
	
		//ATRIBUTOS
		private String titularConta;
		private int agencia;
		private int numeroConta;
		protected double saldo; //mudado de private para protected para que possa ser acessível nas subclasses
		
	
		
		
		
		
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
		
		//MÉTODOS (preferencia por nomes de verbos no imperativo
		// "parametro()" é uma variável que precisa ser recebido de outra classe, (precisa ser passado)
		public void depositar(double quantiaEmReais) {
			saldo += quantiaEmReais;
		}
		
		public void sacar (double quantiaEmReais) {
			saldo -= quantiaEmReais;
		}
		
		public void mostraDadosDaConta() {
			System.out.println("Nome do titular: " + getTitularConta());
			System.out.println("Agência: " + getAgencia());
			System.out.println("Conta: " + getNumeroConta());
			System.out.println("Saldo: " + getSaldo());
		}
	
		
		
		
	
}
