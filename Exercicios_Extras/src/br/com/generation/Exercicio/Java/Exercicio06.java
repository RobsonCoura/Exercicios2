package br.com.generation.Exercicio.Java;

import java.util.Scanner;

//6 � Crie um algoritmo que tenha uma tabela com produtos e pre�os, pergunte ao usu�rio
//qual produto ele quer comprar, depois de escolher o produto, apresente o valor, receba 
//o dinheiro do dinheiro e se necess�rio de o troco ao usu�rio. 
public class Exercicio06 {

	public static void main(String[] args) {
		int numero;
		Double  recebido, troco;
		Scanner ler = new Scanner(System.in);
		
	 System.out.println("P�o [1], leite [2], Biscoito[3]\n Qual dos produtos voc� deseja? ");
	 numero = ler.nextInt();
	 
	 switch(numero) {
	 
	 case 1:
		 System.out.println("O pre�o do p�o � R$0.40 valor unitario: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 0.40); 
		 System.out.println("Seu troco �: " + troco);
		 break;
		 
	 case 2:
		 System.out.println("O pre�o do leite � R$3.40 valor unitario: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 3.40); 
		 System.out.println("Seu troco �: " + troco);
		 break;
	 case 3:
		 System.out.println("O pre�o do biscoito � R$4.45 pacote: \n");
		 System.out.println("Precisa de troco pra quanto?");
		 recebido = ler.nextDouble();
		 troco = (recebido - 4.45); 
		 System.out.println("Seu troco �: " + troco);
		 break;
		 default:System.out.println("Opera��o invalida");
		 break;
		 
	 } 
	}

}
