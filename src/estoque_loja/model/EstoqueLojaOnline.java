package estoque_loja.model;

public class EstoqueLojaOnline extends Estoque {
		
	private int quantidadeLojaOnline;
	
	public EstoqueLojaOnline(int tipoDePeca, String cor, String tamanho, double preco, int quantidadeTotal, int quantidadeLojaOnline) {
		super(tipoDePeca, cor, tamanho, preco, quantidadeTotal);
		this.quantidadeLojaOnline = quantidadeLojaOnline;
	}

	public int getQuantidadeLojaOnline() {
		return quantidadeLojaOnline;
	}

	public void setQuantidadeLojaOnline(int quantidadeLojaOnline) {
		this.quantidadeLojaOnline = quantidadeLojaOnline;
	}

	@Override
	public boolean removerDoEstoque(int produto) {
		if(this.getQuantidadeTotal() + this.quantidadeLojaOnline < produto) {
			System.out.println("\nNão há quantidade suficiente do produto a ser removido!");
					return false;
		}
		else if(getQuantidadeTotal() == 0 && getQuantidadeLojaOnline() < 0) {
			this.setQuantidadeLojaOnline(getQuantidadeLojaOnline() - produto);
			return true;
		}
		this.setQuantidadeTotal(getQuantidadeTotal() - produto);
		System.out.println("Produto removido com sucesso do ESTOQUE TOTAL!");
				return true;
	}
	
	public void visualizarProdutos() {
		super.visualizarProdutos();
		System.out.println("Quantidade disponível no estoque online: " + this.quantidadeLojaOnline);
	}
	

}
