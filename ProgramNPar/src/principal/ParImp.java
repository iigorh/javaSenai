package principal;

import java.util.Scanner;

public class ParImp {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
        
        System.out.println("Informe um n�mero: ");
        int n1 = sc.nextInt();       

        if(n1 % 2 == 0){
            System.out.println(n1 + " � um n�mero par.");
      } 
        else if (n1 % 2 != 0) {
        	System.out.println(n1 + " � um n�mero impar");
        }
        else{
            System.out.println("N�o foi poss�vel definir");
            
         sc.close();   
        }

	}

}
