package principal;

import java.util.Scanner;

import entities.dados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		dados eq = new dados();
		
		System.out.println("Entre com o valor de 'a': ");
		eq.a = sc.nextInt();
		
		System.out.println("Entre com o valor de 'b': ");
		eq.b = sc.nextInt();
		
		System.out.println("Entre com o valor de 'c': ");
		eq.c = sc.nextInt();
		
		System.out.println(eq.retornaX());
		
		sc.close();
		

	}

}
