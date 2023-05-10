package principal;

import java.util.Scanner;

public class ParImp {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
        
        System.out.println("Informe um número: ");
        int n1 = sc.nextInt();       

        if(n1 % 2 == 0){
            System.out.println(n1 + " é um número par.");
      } 
        else if (n1 % 2 != 0) {
        	System.out.println(n1 + " é um número impar");
        }
        else{
            System.out.println("Não foi possível definir");
            
         sc.close();   
        }

	}

}
