package principal;

import java.util.Scanner;

public class ProgramNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota do 1� Bimestre: ");
		double n1 = sc.nextDouble();

		System.out.println("Informe a nota do 2� Bimestre: ");
		double n2 = sc.nextDouble();

		System.out.println("Informe a nota do 3� Bimestre: ");
		double n3 = sc.nextDouble();

		System.out.println("Informe a nota do 4� Bimestre: ");
		double n4 = sc.nextDouble();

		double resultado = (n1 + n2 + n3 + n4) / 4;

		if (resultado >= 5 && resultado <= 6 ) {
			System.out.printf("A sua m�dia dos 4 bimestres � de: %.2f pontos e voc� est� REPROVADO.", resultado);
		}
		else if (resultado >= 6 && resultado <= 7 ) {
			System.out.printf("A sua m�dia dos 4 bimestres � de: %.2f pontos e voc� est� de RECUPERA��O.", resultado );
		}
		else if (resultado > 7) {
			System.out.printf("A sua m�dia dos 4 bimestres � de: %.2f pontos e voc� est� APROVADO", resultado);
		}
		else if (resultado == 10) {
			System.out.printf("A sua m�dis dos 4 bimestre � de: %.2f pontos e voc� foi APROVADO com honras.", resultado);
		}
		else {System.out.printf("N�o foi poss�vel definir a sua nota"); 
		}
		
		sc.close();

		

	}

}
