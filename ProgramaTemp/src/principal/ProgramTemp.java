package principal;

import java.util.Scanner;

public class ProgramTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double far = sc.nextDouble();
		
		
		double resultado = 5*((far-32)/9);
		sc.close();
		
		System.out.println("A temperatura em celcius � de: " + resultado + "graus");

	}

}
