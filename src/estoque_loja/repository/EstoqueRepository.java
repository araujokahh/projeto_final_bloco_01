package estoque_loja.repository;

import estoque_loja.model.Estoque;

public interface EstoqueRepository {
	
	public void cadastrarProduto(Estoque estoque);
	public void listarTodos();
	public void buscarPorTipo(int tipo);
	public void atualizar(Estoque estoque);
	public void deletar(int quantidade);
	

}
