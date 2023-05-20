package entities;

public class Telefonista extends Funcionarios{
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
	 * +bonificação de 10% no salário após a meta batida
	 * 
	 * Salário bruto com bonificação tem desconto de: INSS = 5% IRPF = 8%
	 * 
	 * Mostre o contracheques de cada um contendo salario base + bonificação,
	 * descontos dos tributos separados e o salario liquido.
	 */
	private  int baia;

	public Telefonista(String nome, String cargo, int baia) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.baia = baia;
	}
	
	
	
}
