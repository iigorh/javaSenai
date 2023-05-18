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
		
		System.out.println("Deseja aumentar seu volume? Se sim, digite 1");
		int av = sc.nextInt();
		if(av == 1) {
			televisor.aumentarVolume();
	        televisor.status();
		}

		System.out.println("Deseja subir de canal? Se sim, digite 1");
		int ac = sc.nextInt();
		if(ac == 1) {
        televisor.subirCanal();
        televisor.status();
		}
        
        System.out.println("Deseja diminuir de canal? Se sim, digite 1");
        int dc = sc.nextInt();
        if(dc == 1) {
        televisor.descerCanal();
        televisor.status();
        }
        
        System.out.println("Deseja diminuir o volume? Se sim, digite 1");
        int dv = sc.nextInt();
        if(dv == 1) {
        	televisor.diminuirVolume();
            televisor.status();	
        }
        
        System.out.println("Deseja desligar a televisão? Se sim, digite 1");
        int dt = sc.nextInt();
        if(dt == 1) {
        televisor.desligarTV();
        televisor.status();
        }
    }
	

}
