package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/* sc � uma var acessora do Scanner*/
		//o sx pode-se ler como "leia" do visual G
		/* vv como usar scanner pra qualquer tipo de variavel*/
		
		 
		// inicio programa que pede entrada de info do usuario
		System.out.println("Entre com o seu Sexo:");
		char sexo = sc.next() .charAt(0);
		
		System.out.println("Entre com a sua idade:");
		int idade = sc.nextInt();
		
		sc.nextLine(); // para o scanner entender que ap�s um int (ou double) haver� outros dados
		
		System.out.println("Entre com seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Entre com a sua altura:");
		double altura = sc.nextDouble();
		
		sc.close(); /* para dizer que n vai ter mais nenhuma entrada de dados. pra fechar o scanner*/
		
		//vv para imprimir o que foi inserido
		System.out.println("Meu nome �: " + nome
				+"\n Minha idade �: " + idade
				+"\n Meu sexo �: " + sexo
				+"\n Minha altura �: " + altura);
		// fim do programa que pede entrada de info do usuario
		
	
			
		
		
		
		
		
		
		

	}

}
