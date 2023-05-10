package principal;

import java.util.Scanner;

public class ProgramRepet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
/* contador 1 a 10
 * 	//FOR
		//"for" é pra ser usada quando ja sabemos a quantidade de vezes que deve ser executado
		
		for (int contador = 0; contador <=10; contador ++) {
			System.out.println("Contador esta valendo: " + contador);
		}
*/ //fim do contador
			
		//"for" é pra ser usada quando ja sabemos a quantidade de vezes que deve ser executado
		//pode ser usado para "questionários" e "formularios"
		
		
		
		/* nome
		for (int contador = 0; contador <=3; contador += 2) {
			System.out.println("digite o nome: ");
			String nome = sc.nextLine ();
			
			System.out.println("nome: " + nome);
			*/ // fim nome
		/* sei lá	
	int soma = 0;
	for (int contador = 0; contador >= -20; contador-=2) {
		System.out.println("valor do contador: " + contador);
		
		soma += contador;
	}
		System.out.println("A soma foi: " + soma);*/ // sei lá
		
 //WHILE
		// usamos a estrutura "while" quando não sabemos a quantidade de vezes que será repetida
		 /* usando char
		System.out.println("Deseja cadastrar um usuário? (s/n)");
		char opcao = sc.next()	.charAt(0);
		int contador = 1;
		
		while(opcao == 's') {
			System.out.println("posição do cadastro " + contador);
			contador ++;
			System.out.println("Deseja cadastrar um usuário? (s/n)");
			opcao = sc.next()	.charAt(0);
		}
		System.out.println("Quantidade de cadastros: " + contador);		
		
		
		//usando string; o equals ele compara com um objeto e string é "tipo um objeto"
		System.out.println("Deseja cadastrar um usuário? (s/n)");
		String opcao = sc.nextLine();
		int contador = 1;
		
		while(opcao.equals("s")) {
			System.out.println("posição do cadastro " + contador);
			contador ++;
			System.out.println("Deseja cadastrar um usuário? (s/n)");
			opcao = sc.nextLine();
		}
		System.out.println("Quantidade de cadastros: " + contador);
		*/
		
		//a estrutura do while garante que o bloco será executado ao menos uma vez
		
		char opcao;
		int contador = 1;
		
		do {
		System.out.println("Deseja cadastrar um usuário? ");
		opcao = sc.next() .charAt(0);
		contador++;
		} while(opcao == 's');
		
		System.out.println("Contador:" + contador);
		
		sc.close();
	
		}
		
	}


