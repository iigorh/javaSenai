package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// *Fa�a um programa que leia 5 numeros e armazene em um array. Depois fa�a com que o programa pergunte ao usu�rio um n�mero qualquer e diga se tem ou n�o no array
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		for (int i = 0;i< 5; i++) {
			System.out.println("Digite um n�mero: ");
			numeros[i] = sc.nextInt();
		}
		
			System.out.println("Escolha um n�mero para verifica��o no array: ");
			int numerover = sc.nextInt();
			
			
			
			for (int i = 0; i < numeros.length;i++) {
				if(numeros[i]== numerover) {
					System.out.println("O n�mero " + numerover + " est� no array.");
					return ;
				}
				System.out.println("O numero " + numerover + " n�o est� no array");
				
				sc.close();	
			}
			
	}
	}
