package entities;

public class Funcionarios {
	/*
	 * Na empresa existem, por enquanto, 3 tipos de funcion�rios para serem
	 * cadastrados, que s�o: Gerente, Secretaria, Telefonista.
	 * 
	 * Gerente tem acesso a um sistema especifico, para isso ele deve possui senha e
	 * usu�rio de acesso. possui um salario de R$ 3.000,00
	 * 
	 * Secretaria possui um numero de telefone, onde os 4 �ltimos n�meros � o seu
	 * ramal possui sal�rio inicial de R$ 1.500,00
	 * 
	 * 
	 * Telefonista trabalha em uma baia numerada que � sua esta��o de trabalho
	 * possui sal�rio inicial de R$ 1.500,00
	 * 
	 * +bonifica��o de 10% no sal�rio ap�s a meta batida ok
	 * 
	 * Sal�rio bruto com bonifica��o tem desconto de: INSS = 5% IRPF = 8%
	 * 
	 * Mostre o contracheques de cada um contendo salario base + bonifica��o,
	 * descontos dos tributos separados e o salario liquido.
	 */
	
	private String nome;
	protected double salarioInicial;
	private double bonus;
	private double salarioLiquido;
	
	
	public Funcionarios(String nome, double salarioInicial, double bonus, double salarioLiquido) {
		super();
		this.nome = nome;
		this.salarioInicial = salarioInicial;
		this.bonus = bonus;
		this.salarioLiquido = salarioLiquido;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioInicial() {
		return salarioInicial;
	}

	public double getBonus() {
		return bonus;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public double calcularBonus(double bonus){
			return bonus * 0.10;	
	}
	
	private void bonus() {
		salarioInicial *= 0.10;

	}
		
	}
	
	

