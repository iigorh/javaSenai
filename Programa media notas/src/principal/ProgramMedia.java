package principal;

import java.util.Scanner;

public class ProgramMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a nota do 1� Bimestre: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Informe a nota do 2� Bimestre: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Informe a nota do 3� Bimestre: ");
		double n3 = sc.nextDouble();
		
		System.out.println("Informe a nota do 4� Bimestre: ");
		double n4 = sc.nextDouble();
		
		double resultado = (n1+n2+n3+n4)/4 ;
		
		// a  opera��o matematica que quiser que seja feita antes, tem de ser colocada entre parenteses, do contr�rio seguir� a preced�ncia matem�tica
		sc.close();
		
		System.out.println("A m�dia dos 4 bimestres � igual a: " + resultado);
		

	}

}
