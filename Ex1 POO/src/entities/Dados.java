package entities;

public class Dados {
	//fa�a uma classe carro que receba
	// suas caracteristicas como:
	//cor, placa, tipo do cambio
	//cris 2 instancias e imprima na tela 
	public String cor;
	public String cambio;
	public String placa;
	public String modelo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n " + modelo + "\n " + cor + "\n " + cambio + "\n " + placa + " ";
	}
	
	
}
