package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um n�mero entre 1 e 7: ");

		int n1 = sc.nextInt();
		switch (n1) {

		case 1:
			System.out.println("Domingo!");
			break;
		case 2:
			System.out.println("Segunda!");
			break;	
		case 3:
			System.out.println("Ter�a!");
			break;
		case 4:
			System.out.println("Quarta!");
			break;
		case 5:
			System.out.println("Quinta!");
			break;
		case 6:
			System.out.println("Sexta!");
			break;
		case 7:
			System.out.println("S�bado!");
			break;

		default:
			System.out.println("O n�mero informado n�o corresponde a nenhum dia da semana");
			break;
		}

		sc.close();

	}

}
