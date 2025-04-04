package estoque_loja.model;

public abstract class Estoque {
	private int tipoDePeca;
	private String cor;
	private String tamanho;
	private double preco;
	private int quantidadeTotal;
	
	public Estoque(int tipoDePeca, String cor, String tamanho, double preco, int quantidadeTotal) {
		this.tipoDePeca = tipoDePeca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.quantidadeTotal = quantidadeTotal;
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

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}
	
	// no momento do cadastro dar as opcoes em switch case de 1 - blusa / 2 calca etc..
	// colocar um switch case para falar se é cadastrado na loja fisica ou online 
	//aqui PROVAVELMENTE TEREI QUE CRIAR O OBJETO COMO PARAMETRO DENTRO DO METODO
//	public void cadastrarProduto(int produto) {
//		this.setQuantidadeTotal(getQuantidadeTotal() + produto);
//	}
//	
	
	public boolean removerDoEstoque(int produto) {
		if(this.getQuantidadeTotal() < produto) {
			System.out.println("\nNão há quantidade suficiente do produto a ser removido!");
					return false;
		}
		this.setQuantidadeTotal(getQuantidadeTotal() - produto);
		System.out.println("Produto removido com sucesso!");
		return true;
	}
	
	
	public void visualizarProdutos() {
		String tipo = "";
		
		switch(this.tipoDePeca) {
		case 1:
			tipo = "Blusa";
			break;
		case 2:
			tipo = "Calça";
			break;
		case 3:
			tipo = "Vestido";
			break;
		}
		
		System.out.println("*********************************************");
		System.out.println("                   ESTOQUE                   ");
		System.out.println("*********************************************");
		System.out.println("Tipo de peça: " + tipo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Quantidade disponível: " + this.quantidadeTotal);


		
		
	}
	
	
	
	
	
}
