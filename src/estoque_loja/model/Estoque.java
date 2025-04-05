package estoque_loja.model;

public abstract class Estoque {
	private int tipoDePeca;
	private String cor;
	private String tamanho;
	private double preco;
	private int quantidade;

	public Estoque(int tipoDePeca, String cor, String tamanho, double preco, int quantidade) {
		this.tipoDePeca = tipoDePeca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getTipoDePeca() {
		return tipoDePeca;
	}

	public void setTipoDePeca(int tipoDePeca) {
		this.tipoDePeca = tipoDePeca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean removerDoEstoque(int produto) {
		if (this.getQuantidade() < produto) {
			System.out.println("\nNão há quantidade suficiente do produto a ser removido!");
			return false;
		}
		this.setQuantidade(getQuantidade() - produto);
		System.out.println("Produto removido com sucesso!");
		return true;
	}

	public void visualizarProdutos() {
		String tipo = "";

		if (tipoDePeca == 1) {
			tipo = "Blusa";
		} else if (tipoDePeca == 2) {
			tipo = "Calça";
		} else {
			tipo = "Opção inválida!";
		}

		System.out.println("*********************************************");
		System.out.println("                   ESTOQUE                   ");
		System.out.println("*********************************************");
		System.out.println("Tipo de peça: " + tipo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Quantidade disponível: " + this.quantidade);

	}

}
