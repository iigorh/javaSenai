package principal;

import java.util.Scanner;

import entitites.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com os 3 lados do triangulo e eu lhe direi qual o tipo");
		
		System.out.println("Lado a: ");
		triangulo.lA = sc.nextDouble();
		
		System.out.println("Lado b: ");
		triangulo.lB = sc.nextDouble();
		
		System.out.println("Base: ");
		triangulo.base = sc.nextDouble();
		
		System.out.println(triangulo.retornaTriangulo());
		sc.close();
	}

}
