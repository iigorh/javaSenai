package principal;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// Fa�a um programa que recebe um valor em real e converta para d�lares na
		// cota��o atual, fa�a o inverso tamb�m;

		/*
		 * REAL PARA D�LAR 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * double d = 5.00; System.out.println("Digite o valor em real: R$"); double r =
		 * sc.nextDouble(); conversor(d, r);
		 * 
		 * 
		 * 
		 * } static void conversor(double d, double r) {
		 * System.out.println("O valor em d�lares � de: US$" + (r * d)); }
		 */

		// D�LAR PARA REAL
		Scanner sc = new Scanner(System.in);

		double d = 5.00;
		System.out.println("Digite o valor em d�lar: US$");
		double r = sc.nextDouble();
		conversor(d, r);
		
		sc.close();
	}

		static void conversor(double d, double r) {
		 System.out.printf("O valor em reais � de: R$%.2f", (r / d)); }
		
		
	}
