package estoque_loja.model;

public class EstoqueLojaOnline extends Estoque {
		
	
	private double taxaEntrega;

    public EstoqueLojaOnline(int tipoDePeca, String cor, String tamanho, double preco, int quantidade, double taxaEntrega) {
        super(tipoDePeca, cor, tamanho, preco, quantidade);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public void visualizarProdutos() {
        super.visualizarProdutos();
        System.out.println("Taxa de Entrega: R$ " + taxaEntrega);
    }
	

}
