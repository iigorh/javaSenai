package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String nome = "Igor";
		int numeroDaConta = 1234;
		int agencia = 4321;
		
		Conta conta = new Conta(nome, numeroDaConta, agencia);	
		Conta contaCorrente = new ContaCorrente(nome, numeroDaConta, agencia);
		ContaPoupanca contaPoupanca = new ContaPoupanca(nome, numeroDaConta, agencia);
		
		conta.depositar(250.00);
		conta.sacar(50.00);
		
		System.out.println(conta);
		System.out.println("\n/******************************/");
		
		contaCorrente.depositar(250.00);
		contaCorrente.sacar(50.00);
		
		System.out.println(contaCorrente);
		System.out.println("\n/******************************/");
		
		contaPoupanca.depositar(250.00);
		contaPoupanca.sacar(50.00);
		System.out.println(contaPoupanca);
		sc.close();
	}

}
