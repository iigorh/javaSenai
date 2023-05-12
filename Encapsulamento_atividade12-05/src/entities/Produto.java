package entities;

public class Produto {
	private String nomeProduto;
	private String categoria;
	private int quantidade;
	private double valorUnitario;
	private double valorTotal;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotal() {
		return quantidade * valorUnitario;
	}
	
	public void entradaProduto(double quantidadeIn){
		valorTotal += valorUnitario * quantidadeIn;
		quantidade += quantidadeIn;
	}
	public void saidaProduto(double quantidadeOut) {
		if (quantidadeOut > quantidade){
			System.out.println("Não há produtos sufientes em estoque!");
		}
		else {
			quantidade -= quantidadeOut;
			valorTotal -= valorUnitario * quantidadeOut;
		}

	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n "+ nomeProduto + "\n " + categoria + "\n " + quantidade + "\n " + "\n ";// + valorTotal ;
	}
	 	
}