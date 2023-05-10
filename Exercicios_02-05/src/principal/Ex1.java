package principal;

public class Ex1 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int contador = 1; contador <= 50; contador++) {
			if (contador %2 != 0) {
				soma = soma + contador;
			}
		}
	System.out.println("A soma do números impares é de: " + soma);
				
			

	}

}
