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
	
	protected String nome;
	protected double salarioInicial;
	protected String cargo;
	
	
	public Funcionarios() {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salarioInicial = 1500.00;
	}
	private String salarioInicial() {
		
		return null;
	}
	public double salarioLiquido() {
		double salarioBruto = salarioInicial + bonus();
		double descontoInss = salarioBruto * 0.05;
		double descontoIrpf = salarioBruto * 0.08;
		return salarioBruto - descontoInss - descontoIrpf;
	}
	public double bonus() {
		return salarioInicial * 0.1;
	}
	
	public void contraCheque() {
		
		System.out.println("******* Contracheque *******");
		System.out.println("\n");
        System.out.println("Nome do funcion�rio: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sal�rio Inicial: " + salarioInicial);
        System.out.println("Bonifica��o: " + bonus());
        System.out.println("Desconto INSS: " + salarioInicial * 0.05);
        System.out.println("Desconto IRPF: " + salarioInicial * 0.08);
        System.out.println("Sal�rio L�quido: " + salarioLiquido());
        System.out.println("===============================");
	}


	
}
	
	

