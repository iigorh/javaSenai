package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String nome = "Luan";
		int numeroDaConta = 1234;
		int agencia = 4321;
		
		Conta conta = new Conta(nome, numeroDaConta, agencia);		
		
		System.out.println(conta);
		
		sc.close();
	}

}
