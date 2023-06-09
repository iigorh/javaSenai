package entities;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DadosCliente cliente = new DadosCliente();

		System.out.println("CADASTRO DE CLIENTE: ");
		System.out.println("Entre com o nome do cliente ");
		cliente.nome = sc.nextLine();
/*
		System.out.println("Entre com o CPF do cliente: ");
		cliente.cpf = sc.nextLine();
*/
		String cpf;
		boolean validoo = false;
		do {
			System.out.println("Entre com o CPF do cliente (123.456.789-xx): ");
			cpf = sc.nextLine();
			validoo = Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf);
			if (!validoo) {
				System.out.println("Formato de CPF inv�lido. Tenta novamente de acordo com o formato espec�ficado.");
			}
		}	while (!validoo);
			cliente.cpf = cpf;
		
			
		String dnasc;
		boolean valido = false;
		do {
			System.out.println("Entre com a data de nascimento do cliente (dd/MM/yyyy): ");
			dnasc = sc.nextLine();
			valido = Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dnasc);
			if (!valido) {
				System.out.println("Formato de data inv�lido. Tente novamente.");
			}
		} while (!valido);
		cliente.dnasc = dnasc;

		System.out.println("Entre com o e-mail do cliente: ");
		cliente.email = sc.nextLine();

		System.out.println("Entre com o telefone do cliente (XX)9xxxx-xxxx) ");
		cliente.telefone = sc.nextLine();

		System.out.println("Entre com o endere�o do cliente: ");
		cliente.endereco = sc.nextLine();

		System.out.println("Cliente cadastrado com sucesso! \n");
		System.out.println("DADOS DO CLIENTE CADASTRADO: \n" + cliente);

		sc.close();

	}

}
