package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Igor";
		//pessoa.idade = 23;
		pessoa.cpf = "001.002.003.10";
		pessoa.sexo = 'M';
		pessoa.retornaIdade(1999);
		
		System.out.println(pessoa);
	}

}
