package principal;

import java.util.Scanner;

public class AnoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        
        System.out.println("Informe um ano: ");
        int ano = sc.nextInt();       

        if(ano % 4 == 0){
            System.out.println(ano + " �  um ano bissexto.");
      } 
        else{
            System.out.println(ano + " n�o � um ano bissexto");
            
         sc.close();   
        }
        
	}
}
