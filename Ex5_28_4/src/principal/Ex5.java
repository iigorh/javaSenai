package principal;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int n2 = sc.nextInt();

        System.out.println("N�meros no intervalo:");

        if (n1 <= n2) {
            for (int inicio = n1; inicio <= n2; inicio++) {
                System.out.println(inicio);
            }
        } else {
            for (int inicio = n1; inicio >= n2; inicio--) {
                System.out.println(inicio);
            }
           
        }
        sc.close();
        }
        }


