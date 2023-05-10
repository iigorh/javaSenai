package principal;

import java.util.Scanner;

public class SexPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
								
		
		System.out.println("Informe o seu sexo");
		char sexo = sc.next() .charAt(0);
		
		if (sexo == 'M' || sexo == 'm' ) {
			System.out.println("O sexo informado foi o masculino");
		}
		else  if (sexo == 'f' || sexo == 'f') {
			System.out.println("O sexo informado foi o feminino");
		}
		else {System.out.println("Não foi possível identificar o sexo informado");
		}
		sc.close();		

	}

}
