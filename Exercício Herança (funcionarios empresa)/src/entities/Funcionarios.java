package entities;

public class Funcionarios {
	/*
	 * Na empresa existem, por enquanto, 3 tipos de funcionários para serem
	 * cadastrados, que são: Gerente, Secretaria, Telefonista.
	 * 
	 * Gerente tem acesso a um sistema especifico, para isso ele deve possui senha e
	 * usuário de acesso. possui um salario de R$ 3.000,00
	 * 
	 * Secretaria possui um numero de telefone, onde os 4 últimos números é o seu
	 * ramal possui salário inicial de R$ 1.500,00
	 * 
	 * 
	 * Telefonista trabalha em uma baia numerada que é sua estação de trabalho
	 * possui salário inicial de R$ 1.500,00
	 * 
	 * +bonificação de 10% no salário após a meta batida ok
	 * 
	 * Salário bruto com bonificação tem desconto de: INSS = 5% IRPF = 8%
	 * 
	 * Mostre o contracheques de cada um contendo salario base + bonificação,
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
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Inicial: " + salarioInicial);
        System.out.println("Bonificação: " + bonus());
        System.out.println("Desconto INSS: " + salarioInicial * 0.05);
        System.out.println("Desconto IRPF: " + salarioInicial * 0.08);
        System.out.println("Salário Líquido: " + salarioLiquido());
        System.out.println("===============================");
	}


	
}
	
	

