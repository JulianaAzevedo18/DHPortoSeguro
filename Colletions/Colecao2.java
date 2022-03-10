package Colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n-----------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque?");
			System.out.println("\n(2) Deseja remover produtos no estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estique?");
			System.out.println("\n(0) Sair.");
			System.out.println("\n-----------------------------------------");
			System.out.println("\nDigite uma op��o: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine(); //limpando o cache de memoria
				System.out.println("\nDigite o produto para adiconar ao estoque: ");
				String AdicionarProduto = ler.nextLine();//lendo a String que o usuario digitou
				//AdicionarProduto.toUpperCase();
				estoque.add(AdicionarProduto);
				break;
			case 2:
				ler.nextLine(); //limpando o cache de memoria
				System.out.println("\nDigite o produto para remover do estoque: ");
				String removerProduto = ler.nextLine();//lendo a String que o usuario digitou
				if(estoque.contains(removerProduto)){
					estoque.remove(removerProduto);
					System.out.println("\nO produto: " + removerProduto + "foi removido do estoque.");
				}
				else {
					System.out.println("\nProduto n�o existente!!!");
				}
				System.out.println(estoque);
				break;
			case 3:
				ler.nextLine(); //limpando o cache de memoria
				System.out.println("\nDigite o produto a ser atualizado: ");
				String atualizarProduto = ler.nextLine();
				String novoProduto = ler.nextLine();
				System.out.println("\nO produto: " + atualizarProduto + " ser� substitu�do por: " + novoProduto);
				
				
				if(estoque.contains(atualizarProduto)) {
					estoque.remove(atualizarProduto);
					estoque.add(novoProduto);
				}
				else {
					System.out.println("\nProduto n�o existe.");
				}
				
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque s�o: .");
				System.out.println(estoque);
				break;
			default:
				if(op == 0) {
					System.out.println("\nTchau. Sistema finalizado.");
				}
				else{
					System.out.println("\nOp��o inv�lida.");
				}
			}
		}
		while(op != 0);
		}

}
