package principal;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
	
		int pessoas = 5;
		double saltura = 0;
		int contador = 1;
		
		while (contador <= pessoas) {
			System.out.println("Digite a altura da pessoa: ");
			double altura = sc.nextDouble();
			saltura = saltura + altura;
			contador++;
		}
		
		double media = saltura / pessoas;
		System.out.printf("A média de altura entre as 5 pessoas é de: %.2f metros", media);
		*/
		
		double altura = 0.0;
		double saltura = 0.0;
		int contador = 0;
		
		while (contador < 5) {
			System.out.println("Digite a altura da pessoa: ");
			altura = sc.nextDouble();
			saltura = saltura + altura;
			contador++;
		}
		
		System.out.printf("A média de altura entre as 5 pessoas é de: " + saltura + contador);
	
		sc.close();
		

	}

}
