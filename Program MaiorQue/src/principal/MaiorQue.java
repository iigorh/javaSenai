package principal;

import java.util.Scanner;

public class MaiorQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Exercício 3 System.out.println("Informe um número: "); int n1 = sc.nextInt();
		 * 
		 * System.out.println("Informe outro número: "); int n2 = sc.nextInt();
		 * 
		 * if(n1 > n2){ System.out.println(n1 +
		 * " é o maior entre os números informados."); } else if (n2 > n1) {
		 * System.out.println(n2 + " é o maior entre os números informados");
		 * 
		 * } else{ System.out.println(n1 + " e " + n2 + " são números iguais");
		 * 
		 * sc.close(); }
		 */

		// Exercício 4

		System.out.println("Informe o primeiro número: ");
		int n1 = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n1> n3) {
			System.out.println(n1 + " é o maior entre os números informados.");
		} 
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " é o maior entre os números informados");
		} 
		else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " é o maior entre os números informados");
		}
		else {
			System.out.println(n1 + " ," + n2 + "e " + n3 +  "são números iguais");

			sc.close();
		}

	}

}
