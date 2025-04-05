package estoque_loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import estoque_loja.controller.EstoqueController;
import estoque_loja.model.Estoque;
import estoque_loja.model.EstoqueGeral;
import estoque_loja.model.EstoqueLojaOnline;

public class Menu {

	public static void main(String[] args) {

		EstoqueController estoque = new EstoqueController();

		Scanner sc = new Scanner(System.in);

		int opcao, tipoProduto, quantidadeProdutoTotal, tipoEstoque;
		String corProduto, tamanhoProduto;
		double precoProduto;

		while (true) {

			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("          ESTOQUE LOJA JAVA FASHION          ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("       1- Cadastrar produto                  ");
			System.out.println("       2- Listar todos os produtos           ");
			System.out.println("       3- Buscar produto                     ");
			System.out.println("       4- Atualizar produto                  ");
			System.out.println("       5- Apagar produto                     ");
			System.out.println("       6- Sair                               ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("Digite a opção desejada:                     ");
			System.out.println("                                             ");

			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("Até logo!! A Loja Java Fashion agradece a sua colaboração! :) ");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				sc.nextLine();
				System.out.println("Cadastrar novo produto:\n\n");

				System.out.print("Digite a cor do produto: ");
				corProduto = sc.nextLine();

				System.out.print("Digite o preço por unidade: R$ ");
				precoProduto = sc.nextDouble();
				sc.nextLine();

				System.out.print("Informe o tamanho da peça (P, M, G): ");
				tamanhoProduto = sc.nextLine();

				do {
					System.out.print("Informe para qual estoque o produto irá (1 - Geral | 2 - Online): ");
					tipoEstoque = sc.nextInt();
					sc.nextLine();
				} while (tipoEstoque < 1 || tipoEstoque > 2);

				System.out.print("Digite o tipo do produto a ser cadastrado (1- Blusa | 2- Calça): ");
				tipoProduto = sc.nextInt();
				sc.nextLine();

				System.out.print("Digite a quantidade de peças a serem cadastradas: ");
				quantidadeProdutoTotal = sc.nextInt();
				sc.nextLine();

				switch (tipoEstoque) {
				case 1 -> {
					EstoqueGeral estoqueGeral = new EstoqueGeral(tipoProduto, corProduto, tamanhoProduto, precoProduto, quantidadeProdutoTotal);
					estoque.cadastrarProduto(estoqueGeral);
					System.out.println("Produto cadastrado com sucesso no ESTOQUE GERAL.");
				}
				case 2 -> {
					EstoqueLojaOnline estoqueLojaOnline = new EstoqueLojaOnline(tipoProduto, corProduto, tamanhoProduto,
							precoProduto, quantidadeProdutoTotal, tipoEstoque);
					estoque.cadastrarProduto(estoqueLojaOnline);
					System.out.println("Produto cadastrado com sucesso no ESTOQUE ONLINE.");
				}
				default -> System.out.println("Número de estoque inválido.");
				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os produtos: \n\n");
				estoque.listarTodos();

				keyPress();
				break;

			case 3:
				System.out.println("Buscar produto: \n\n");

				System.out.print("Informe o tipo do produto que deseja buscar (1- Blusa | 2- Calça): ");
				tipoProduto = sc.nextInt();
				estoque.buscarPorTipo(tipoProduto);

				keyPress();
				break;

			case 4:
				System.out.println("Atualizar produto: \n\n");

				sc.nextLine();
				System.out.print("Digite o tipo do produto que deseja atualizar (1- Blusa | 2- Calça): ");
				tipoProduto = sc.nextInt();
				sc.nextLine();

				System.out.print("Nova cor: ");
				corProduto = sc.nextLine();
				System.out.print("Novo tamanho: ");
				tamanhoProduto = sc.nextLine();
				System.out.print("Novo preço: R$ ");
				precoProduto = sc.nextDouble();
				sc.nextLine();
				System.out.print("Nova quantidade: ");
				quantidadeProdutoTotal = sc.nextInt();
				sc.nextLine();

				Estoque atualizado = new EstoqueGeral(tipoProduto, corProduto, tamanhoProduto, precoProduto,
						quantidadeProdutoTotal);
				estoque.atualizar(atualizado);
				System.out.println("Ihuull!! Produto atualizado com sucesso!!");

				keyPress();
				break;

			case 5:
				System.out.println("Apagar produto do estoque: \n\n");
				
				System.out.print("Informe o tipo do produto que deseja apagar (1- Blusa | 2- Calça): ");
				tipoProduto = sc.nextInt();
				estoque.deletar(tipoProduto);
				System.out.println("Produto removido.");
				
				keyPress();
				break;

			default:
				System.out.println("Opção inválida!!");
				keyPress();
				break;
			}

		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para continuar.");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma techa diferente de enter!");
		}
	}

}
