package principal;

import java.util.Scanner;

public class MaiorQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Exerc�cio 3 System.out.println("Informe um n�mero: "); int n1 = sc.nextInt();
		 * 
		 * System.out.println("Informe outro n�mero: "); int n2 = sc.nextInt();
		 * 
		 * if(n1 > n2){ System.out.println(n1 +
		 * " � o maior entre os n�meros informados."); } else if (n2 > n1) {
		 * System.out.println(n2 + " � o maior entre os n�meros informados");
		 * 
		 * } else{ System.out.println(n1 + " e " + n2 + " s�o n�meros iguais");
		 * 
		 * sc.close(); }
		 */

		// Exerc�cio 4

		System.out.println("Informe o primeiro n�mero: ");
		int n1 = sc.nextInt();

		System.out.println("Informe o segundo n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n1> n3) {
			System.out.println(n1 + " � o maior entre os n�meros informados.");
		} 
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " � o maior entre os n�meros informados");
		} 
		else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " � o maior entre os n�meros informados");
		}
		else {
			System.out.println(n1 + " ," + n2 + "e " + n3 +  "s�o n�meros iguais");

			sc.close();
		}

	}

}
