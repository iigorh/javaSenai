package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		 //////////MEGASENA
		/*
		int[] sorteio = new int[6];
		
		System.out.print("N�meros sorteados: ");
		
		for(int i = 0; i < 6; i++) {
		 sorteio[i] = rd.nextInt(61)+1;
		 
		 System.out.print(sorteio[i]+ "\t");
		}
		*/
	
		
		
		String[] nomes = new String[11];
		
		for(int i = 0 ;i < 10; i++) {
			System.out.println("Insiram um nome: ");
			nomes[i] = sc.nextLine();
		}
		int sorteio = rd.nextInt(11);
		String nomeSorteado = nomes[sorteio];
		
		System.out.println("nome sorteado: " + nomeSorteado);
		
		
		
		
		
	}
}	