package principal;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite seu nome: ");
	        String nome = sc.nextLine();
	        while (nome.length() <= 3) {
	            System.out.println("O nome deve ter mais de 3 caracteres.");
	            System.out.println("Digite seu nome: ");
	            nome = sc.nextLine();
	        }

	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();
	        while (idade < 0 || idade > 150) {
	            System.out.println("A sua idade deve estar entre 0 e 150");
	            System.out.println("Digite sua idade: ");
	            idade = sc.nextInt();
	        }

	        System.out.print("Digite seu salário: ");
	        double salario = sc.nextDouble();
	        while (salario <= 0) {
	            System.out.println("O seu salário deve ser maior que zero.");
	            System.out.println("Digite seu salário: ");
	            salario = sc.nextDouble();
	        }

	        System.out.print("Digite seu sexo (m/f): ");
	        char sexo = sc.next().charAt(0);
	        while (sexo != 'm' && sexo != 'f') {
	            System.out.println("O seu sexo deve ser 'f' ou 'm'.");
	            System.out.println("Digite seu sexo (m/f)");
	            sexo = sc.next().charAt(0);
	        }

	        System.out.print("Digite seu estado civil (s/c/v/d): ");
	        char estadoCivil = sc.next().charAt(0);
	        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
	            System.out.println("O estado civil deve ser 's', 'c', 'v' ou 'd'.");
	            System.out.println("Digite seu estado civil (s/c/v/d): ");
	            estadoCivil = sc.next().charAt(0);
	        }
	        sc.close();
	        System.out.println("Informações válidas: ");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Salário: " + salario);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);

	}

}
