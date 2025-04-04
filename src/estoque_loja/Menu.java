package estoque_loja;

import java.util.Scanner;

import estoque_loja.model.Estoque;
import estoque_loja.model.EstoqueLojaOnline;

public class Menu {

	public static void main(String[] args) {
		
		
		//TESTE DA CLASSE ESTOQUE LOJA ONLINE
		// OBS: a quantidade não está saindo do estoque online - LEMBRAR DE ARRUMAR
		EstoqueLojaOnline online1 = new EstoqueLojaOnline(3, "Azul", "PP", 70.0d, 0, 5);
		online1.visualizarProdutos();
		online1.removerDoEstoque(1);
		online1.visualizarProdutos();

		Scanner sc = new Scanner(System.in);

		int opcao;
		
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

		opcao = sc.nextInt();

			if (opcao == 6) {
				System.out.println("Até logo!! A Loja Java Fashion agradece a sua colaboração! :) ");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo produto: \n\n");

				break;

			case 2:
				System.out.println("Listar todos os produtos: \n\n");

				break;

			case 3:
				System.out.println("Buscar produto: \n\n");

				break;

			case 4:
				System.out.println("Atualizar produto: \n\n");

				break;

			case 5:
				System.out.println("Apagar produto do estoque: \n\n");

				break;

			default:
				System.out.println("Opção inválida!!");
				break;
			}

		}

	}

}
