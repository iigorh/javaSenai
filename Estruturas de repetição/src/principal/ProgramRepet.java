package principal;

import java.util.Scanner;

public class ProgramRepet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
/* contador 1 a 10
 * 	//FOR
		//"for" � pra ser usada quando ja sabemos a quantidade de vezes que deve ser executado
		
		for (int contador = 0; contador <=10; contador ++) {
			System.out.println("Contador esta valendo: " + contador);
		}
*/ //fim do contador
			
		//"for" � pra ser usada quando ja sabemos a quantidade de vezes que deve ser executado
		//pode ser usado para "question�rios" e "formularios"
		
		
		
		/* nome
		for (int contador = 0; contador <=3; contador += 2) {
			System.out.println("digite o nome: ");
			String nome = sc.nextLine ();
			
			System.out.println("nome: " + nome);
			*/ // fim nome
		/* sei l�	
	int soma = 0;
	for (int contador = 0; contador >= -20; contador-=2) {
		System.out.println("valor do contador: " + contador);
		
		soma += contador;
	}
		System.out.println("A soma foi: " + soma);*/ // sei l�
		
 //WHILE
		// usamos a estrutura "while" quando n�o sabemos a quantidade de vezes que ser� repetida
		 /* usando char
		System.out.println("Deseja cadastrar um usu�rio? (s/n)");
		char opcao = sc.next()	.charAt(0);
		int contador = 1;
		
		while(opcao == 's') {
			System.out.println("posi��o do cadastro " + contador);
			contador ++;
			System.out.println("Deseja cadastrar um usu�rio? (s/n)");
			opcao = sc.next()	.charAt(0);
		}
		System.out.println("Quantidade de cadastros: " + contador);		
		
		
		//usando string; o equals ele compara com um objeto e string � "tipo um objeto"
		System.out.println("Deseja cadastrar um usu�rio? (s/n)");
		String opcao = sc.nextLine();
		int contador = 1;
		
		while(opcao.equals("s")) {
			System.out.println("posi��o do cadastro " + contador);
			contador ++;
			System.out.println("Deseja cadastrar um usu�rio? (s/n)");
			opcao = sc.nextLine();
		}
		System.out.println("Quantidade de cadastros: " + contador);
		*/
		
		//a estrutura do while garante que o bloco ser� executado ao menos uma vez
		
		char opcao;
		int contador = 1;
		
		do {
		System.out.println("Deseja cadastrar um usu�rio? ");
		opcao = sc.next() .charAt(0);
		contador++;
		} while(opcao == 's');
		
		System.out.println("Contador:" + contador);
		
		sc.close();
	
		}
		
	}


