package principal;

public class Funcoes {

	public static void main(String[] args) {

		mensagem();
		String ms2 = mensagem2();
		System.out.println(ms2);
		System.out.println(mensagem3("Igor"));
		calculo(2, 3);
		
	}

	static void mensagem() {
		System.out.println("Minha primeira fun��o");
	}

	static String mensagem2() {
		return "minha fun��o";
	}

	static String mensagem3(String msg) {
		return "Meu nome passado por parametro �: " + msg;
	}
	
	static void calculo(int n, int m) {
		System.out.println("O resultado da soma �: " + (n + m));
	}
	


}
