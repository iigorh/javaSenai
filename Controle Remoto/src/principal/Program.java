package principal;

import java.util.Scanner;

import entites.Tv;

public class Program {

	public static void main(String[] args) {
		Tv televisor = new Tv();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Desejar ligar sua tv? Se sim, digite 1");
		int of = sc.nextInt();
		if(of == 1) {
        televisor.ligarTv();
        televisor.status();
		}
		
		System.out.println("Deseja aumentar seu volume?");
		int av = sc.nextInt();
		if(av == 1) {
			televisor.aumentarVolume();
	        televisor.status();
		}

        televisor.subirCanal();
        televisor.aumentarVolume();
        televisor.status();

        televisor.descerCanal();
        televisor.diminuirVolume();
        televisor.status();

        televisor.desligarTV();
        televisor.status();
    }
	

}


