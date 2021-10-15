package br.com.generation.CollectionsExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		int press = -1;
		
		estoque.add(new Estoque("Biscoito", 10));
		estoque.add(new Estoque("Bolacha", 20));
		estoque.add(new Estoque("Pipoca", 30));
		estoque.add(new Estoque("Chocolate", 40));
		
		while(press !=0) {
			
		System.out.println("O QUE VOCÊ DESEJA?\n\n[1]ADICIONAR PRODUTO \n[2]REMOVER PRODUTO \n[3]ATUALIZAR PRODUTO \n[0]SAIR" );
		press = sc.nextInt();
		
			if (press == 1) {
				System.out.println("Digite o nome do produto: ");			
				String produto = sc.next();
			
				System.out.println("Digite o código do produto");
				int numSerie = sc.nextInt();
			
				System.out.println();
				estoque.add(new Estoque(produto, numSerie));
				} 
		
			else if (press == 2) {
				System.out.println("Digite o número do item que deseja remover: ");
				int i = sc.nextInt();
				estoque.remove(i);
			
				} 
		
			else if (press == 3) {
				System.out.println("Digite o número do item que deseja atualizar: ");
				int i = sc.nextInt();
			
				System.out.println("Digite o nome do novo produto: ");
				String produto = sc.next();
			
				System.out.println("Digite o nº de série do produto: ");
				int numSerie = sc.nextInt();
			
				estoque.set(i, new Estoque(produto, numSerie));			
			} 
		
			else {
			System.out.println("Obrigado, volte sempre!!!");
			}
		
			for (int i = 0; i < estoque.size(); i++ ) {
			System.out.println(i + "|" + estoque.get(i));	
			System.out.println();
			}
		}
		sc.close();
	}
}