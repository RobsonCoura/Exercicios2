package br.com.generation.Exercicio.Java;

import java.util.Scanner;

//6 – Crie um algoritmo que tenha uma tabela com produtos e preços, pergunte ao usuário
//qual produto ele quer comprar, depois de escolher o produto, apresente o valor, receba 
//o dinheiro do dinheiro e se necessário de o troco ao usuário. 
public class Exercicio06 {

	public static void main(String[] args) {
		int numero;
		Double  recebido, troco;
		Scanner ler = new Scanner(System.in);
		
	 System.out.println("Pão [1], leite [2], Biscoito[3]\n Qual dos produtos você deseja? ");
	 numero = ler.nextInt();
	 
	 switch(numero) {
	 
	 case 1:
		 System.out.println("O preço do pão é R$0.40 valor unitario: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 0.40); 
		 System.out.println("Seu troco é: " + troco);
		 break;
		 
	 case 2:
		 System.out.println("O preço do leite é R$3.40 valor unitario: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 3.40); 
		 System.out.println("Seu troco é: " + troco);
		 break;
	 case 3:
		 System.out.println("O preço do biscoito é R$4.45 pacote: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 4.45); 
		 System.out.println("Seu troco é: " + troco);
		 break;
		 default:System.out.println("Operação invalida");
		 break;
		 
	 } 
	}

}
