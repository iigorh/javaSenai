package principal;

import java.text.NumberFormat; //permitir� a formata��o do n�mero adequadamente
import java.util.Locale; // permitir� a configura��o da localidade
import java.util.Scanner;

public class ProgramSalHor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe quanto voc� recebe por hora trabalhada: ");
		float salarioHora = sc.nextFloat();
		
		System.out.println("Informe quantas horas voc� trabalhou neste m�s: ");
		int horaMes = sc.nextInt();
		
		float resultado = salarioHora*horaMes;
		
		//"criar" objeto para classe que entenda a moeda br
		
		Locale localBrasil = new Locale("pt", "BR");
		
		//para formatar para moeda brasileira
		
		String brasil = NumberFormat.getCurrencyInstance(localBrasil).format(resultado);
		
		sc.close();
		
		
		//System.out.printf("Este � o seu sal�rio no referido m�s: R$%5f", resultado);
		System.out.println("Este m�s voc� receber� o valor bruto de " + brasil + " pelas horas trabalhadas");

	}

}
