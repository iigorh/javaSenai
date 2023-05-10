package principal;

import java.util.Scanner;

public class SalarioFunc {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o sal�rio base do vendedor");
		double salarioB = sc.nextDouble();

		System.out.println("Agora digite a quantidade total de vendas dele no m�s: ");
		double vendasNoMes = sc.nextDouble();
		
		System.out.println("CONTRACHEQUE DO VENDEDOR NO M�S CORRENTE ");

		calcSalarioLiq(salarioB, calcBonus(vendasNoMes));
		
		sc.close();
		

	}



	static double calcBonus(double vendasNoMes) {
			if (vendasNoMes > 20000) {
				return vendasNoMes *0.05;
		}	else if (vendasNoMes >= 15000 && vendasNoMes <= 20000) {
				return vendasNoMes * 0.03;
		}	else if (vendasNoMes >= 10000 && vendasNoMes <=15000) {
				return vendasNoMes * 0.01;
		}
			return vendasNoMes;	
		}

	static void calcSalarioLiq(double salarioB, double vendasNoMes) {
			double inss = salarioB*0.05;
			double irpf = salarioB*0.11;
			double salarioLiq = salarioB - inss - irpf;
			System.out.printf("Sal�rio Bruto =  R$%.2f", salarioB);
			System.out.printf("\nDesconto INSS = -R$%.2f", inss);
			System.out.printf("\nDesconto IRPF = -R$%.2f", irpf);
			if(vendasNoMes < 10000) {
				System.out.printf("\nSal�rio Liqu. =  R$%.2f",  salarioLiq);
				System.out.printf("\nSalario liqu. =  R$%.2f \nComiss�o      = +R$%.2f \nSal�rio Liquido total = R$%.2f", salarioLiq, vendasNoMes, (salarioLiq + vendasNoMes));
			}else   {System.out.printf("\nSalario liquido =  R$%.2f", salarioLiq);
					System.out.println("\nVoc� n�o atingiu o suficiente para receber um b�nus, continue tentando para alcan�ar no futuro!");
		}
	}
	

	 }		

	
