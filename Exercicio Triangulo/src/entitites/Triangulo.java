package entitites;

public class Triangulo {

	public double lA;
	public double lB;
	public double base;
	
	public String retornaTriangulo() {
		if(lA == lB && lB ==base) {
		return "O triangulo é do tipo equilatero";
	}
		if (lA == lB || lA == base || lB == base) {
			return "O triangulo é do tipo isosceles";
			
		}
		return "O triangulo é do tipo escaleno";
	
}
}