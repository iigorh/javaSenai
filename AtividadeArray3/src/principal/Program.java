package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// **Fa�a um programa que receba o nome do aluno e as 4 notas bimestrais desse
		// aluno;

		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();

		double[] notas = new double[4];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do bimestre: ");
			notas[i] = sc.nextDouble();
		}
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Notas Bimestrais: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);

		}
		sc.close();

	}

}
