package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dados carro1 = new Dados();
		Dados carro2 = new Dados();
		
		System.out.println("PRIMEIRO CARRO");
		System.out.println("Qual o modelo do carro? ");
		carro1.modelo = sc.nextLine();
		
		System.out.println("Entre com a cor do carro: ");
		carro1.cor = sc.nextLine(); 
		
		System.out.println("Entre com a placa do carro: ");
		carro1.placa = sc.nextLine();
		
		System.out.println("Entre com o tipo de câmbio do carro:");
		carro1.cambio = sc.nextLine();
		
		
		System.out.println("SEGUNDO CARRO");
		
		System.out.println("Qual o modelo do carro? ");
		carro2.modelo = sc.nextLine();
		System.out.println("Entre com a cor do carro: ");
		carro2.cor = sc.nextLine(); 
		
		System.out.println("Entre com a placa do carro: ");
		carro2.placa = sc.nextLine();
		
		System.out.println("Entre com o tipo de câmbio do carro: \n");
		carro2.cambio = sc.nextLine();
		
		
		System.out.println("CARACTERÍSTICAS DO 1º CARRO: \n" + carro1);
		
		System.out.println("\n");
		
		System.out.println("CARACTERÍSTICAS DO 2º CARRO: \n" + carro2);
		
		sc.close();

	}

}
