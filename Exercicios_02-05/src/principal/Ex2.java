package principal;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*
		 SEM ESTRUTURA DE REPETIÇÃO.
		int pessoas = 5;
		
		
		System.out.println("Insira a altura da 1ª pessoa: ");
		double a1 = sc.nextDouble();
		
		System.out.println("Insira a altura da 2ª pessoa: ");
		double a2 = sc.nextDouble();
		
		System.out.println("Insira a altura da 3ª pessoa: ");
		double a3 = sc.nextDouble();
		
		System.out.println("Insira a altura da 4ª pessoa: ");
		double a4 = sc.nextDouble();
		
		System.out.println("Insira a altura da 5ª pessoa: ");
		double a5 = sc.nextDouble();
		
		double altura = (a1+a2+a3+a4+a5)/ pessoas;
		System.out.printf("A média de altura entre as 5 pessoas é de: %.2f metros", altura);
			
		sc.close();
		*/
		
		//UTILIZANDO ESTRUTURA DE REPETIÇÃO
		
		
		int pessoas = 5;
		double saltura = 0;
		
		for (int contador = 0; contador <pessoas; contador ++) {
			System.out.println("Digite a altura da pessoa: ");
			double altura = sc.nextDouble();
			saltura = saltura + altura;
		}
		
		double media = saltura / pessoas ;
		System.out.printf("A média de altura entre as 5 pessoas é de: %.2f metros", media);
		sc.close();
		}
			
		

	}

