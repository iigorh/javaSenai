package principal;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Digite 1 para 'sim' e 0 para'n�o': ");
		int opcao = sc.nextInt();
		
		int contador = 0;
		
		while (opcao == 1) {
			contador++;
			System.out.println("Contador: " + contador);
			System.out.println("Digite 1 para 'sim' e 0 para 'n�o: ");
			opcao = sc.nextInt();
		} System.out.println("Quantidade de 'sim' digitadas: " + contador);
			
		sc.close();
	}

}
