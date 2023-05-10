package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//*Faça um programa que peça quantidade x de nomes e mostre os nomes inseridos;
		
		System.out.println("Digite a quantidade de nomes que serão inseridos: ");
		int qnomes = sc.nextInt(); sc.nextLine();//<<esse sc.nextLine foi inserido para conseguir inserir texto após numero
		
		String[] nomes = new String[qnomes];
		
		for(int i = 0; i < qnomes; i++) {
			System.out.println("Digite o nome: " );
			nomes[i] = sc.nextLine();
		}
		System.out.println("Nomes inseridos: ");
		for(int i = 0; i< qnomes; i++) {
			System.out.println(nomes[i]);
	
		}
		sc.close();
	}
	

}
