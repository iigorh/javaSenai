package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um n�mero");
		int n1 = sc.nextInt();
		sc.close();
		System.out.println("O n�mero informado foi: " + n1);

	}

}
