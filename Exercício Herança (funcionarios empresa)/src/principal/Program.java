package principal;

import entities.Gerente;
import entities.Secretaria;
import entities.Telefonista;

public class Program {

	public static void main(String[] args) {
	
		Gerente gerente = new Gerente ("Jorge", "Gerente", "jorge123", "jorgegerente10");
		Secretaria secretaria = new Secretaria("Joice", "Secretaria", "6789-1234");
		Telefonista telefonista = new Telefonista("Julia", "Telefonista", 15);
		
		gerente.contraCheque();
		secretaria.contraCheque();
		telefonista.contraCheque();
		
	}

}
