package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
				
		System.out.println("Informe um n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Informe outro n�mero: ");
		int n2 = sc.nextInt();
		
		int resultado = n1+n2;
		
		sc.close();
		
		System.out.println("O resultado da soma dos dois n�meros �: " + resultado);
				

	}

}
