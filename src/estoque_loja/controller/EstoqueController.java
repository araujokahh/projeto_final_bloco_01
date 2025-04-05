package estoque_loja.controller;

import java.util.ArrayList;

import estoque_loja.model.Estoque;
import estoque_loja.repository.EstoqueRepository;

public class EstoqueController implements EstoqueRepository{
	
	private ArrayList<Estoque> listaEstoque = new ArrayList<>();
	int numeroOrdemDoProduto = 0;

	@Override
	public void cadastrarProduto(Estoque estoque) {
		listaEstoque.add(estoque);
		System.out.println("\nO item: " + estoque.getTipoDePeca() + " foi adicionado ao estoque!");
		
	}

	@Override
	public void listarTodos() {
		for (var estoque : listaEstoque) {
			estoque.visualizarProdutos();
		}
	}

	@Override
	public void buscarPorTipo(int tipo) {
		for (Estoque e : listaEstoque) {
            if (e.getTipoDePeca() == tipo) {
                e.visualizarProdutos();
            }
        }
		
	}

	@Override
	public void atualizar(Estoque estoque) {
		for (int i = 0; i < listaEstoque.size(); i++) {
            if (listaEstoque.get(i).getTipoDePeca() == estoque.getTipoDePeca()) {
                listaEstoque.set(i, estoque);
                return;
            }
        }
		
	}

	@Override
	public void deletar(int tipo) {
        listaEstoque.removeIf(e -> e.getTipoDePeca() == tipo);

	}
	
}
