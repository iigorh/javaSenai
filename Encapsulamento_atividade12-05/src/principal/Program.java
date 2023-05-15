package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();

		
		System.out.printf("\nO produto " + "'" + p1.getNomeProduto() + "'"
				+ " está cadastrado no estoque!\nQuantidade do produto em estoque: " + p1.getQuantidade()
				+ " unidades" + "\nValor do estoque atualizado: R$%.2f", p1.getValorTotal());

		System.out.println("\nDigite a quantidade a ser retirada do estoque: ");
		p1.saidaProduto(sc.nextDouble());

		System.out.printf("Seu estoque do produto " + "'" + p1.getNomeProduto() + "'"
				+ " foi atualizado com sucesso!\nQuantidade atualizada do produto em estoque: " + p1.getQuantidade()
				+ "\nValor total do estoque atualizado: R$%.2f", p1.getValorTotal());

		sc.close();
	}

}
