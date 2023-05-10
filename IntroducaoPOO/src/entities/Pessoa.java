package entities;

public class Pessoa {

	public String nome;
	public int idade;
	public char sexo;
	public String cpf;

	public void retornaIdade(int ano) {
		idade = 2023 - ano;
	}
	//para imprimir tudo de uma vez e chama somente o "pessoa" no programa
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return nome + "\n " + idade + "\n " + sexo + "\n " + cpf +" ";
			
	}

}
