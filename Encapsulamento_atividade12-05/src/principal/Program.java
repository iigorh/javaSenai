package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		p1.setNomeProduto(sc.nextLine());
		
		System.out.println("Digite a categoria do produto: ");
		p1.setCategoria(sc.nextLine());
		
		System.out.println("Digite a quantidade do produto que está sendo adicionada ao estoque: ");
		p1.setQuantidade(sc.nextInt());
		
		System.out.println("Digite o valor unitário do produto: ");
		p1.setValorUnitario(sc.nextDouble());
		
		System.out.printf("\nO produto " + "'" + p1.getNomeProduto()+ "'" + " foi cadastrado com sucesso no estoque!\nQuantidade do produto em estoque: " + p1.getQuantidade()+ "\nValor do estoque atualizado: R$%.2f",  p1.getValorTotal());
		
		System.out.println("\n\nADIÇÃO DO PRODUTO " + "'"+ p1.getNomeProduto() +"'" + " AO ESTOQUE : ");
		
		System.out.println("\nDigite a quantidade de produtos que estão sendo adicionados ao estoque");
		p1.entradaProduto(sc.nextDouble());
		
		System.out.printf("Seu estoque do produto " + "'" + p1.getNomeProduto()+ "'" + " foi atualizado com sucesso!\n\nQuantidade atualizada do produto em estoque: " + p1.getQuantidade()+ "\nValor do estoque atualizado: R$%.2f",  p1.getValorTotal());
		
		System.out.println("\nDigite a quantidade do produto a ser retirado do estoque: ");
		p1.saidaProduto(sc.nextDouble());
		
		System.out.printf("Seu estoque do produto " + "'" + p1.getNomeProduto()+ "'" + " foi atualizado com sucesso!\nQuantidade atualizada do produto em estoque: " + p1.getQuantidade()+ "\nValor do estoque atualizado: R$%.2f",  p1.getValorTotal());
		
		
sc.close();
	}

}
