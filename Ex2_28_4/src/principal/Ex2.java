package principal;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu usuário: ");
		String user = sc.nextLine();
		
		
		System.out.println("Insira sua senha: ");
		String pass = sc.nextLine();
		
		while (user.equals(pass)) {
			System.out.println("Erro!");
			System.out.println("Insira seu usuário: ");
				user = sc.nextLine();
			System.out.println("Insira sua senha: ");	
				pass = sc.nextLine();
		}
		System.out.printf("Login efetuado!");

		sc.close();

	}

}
