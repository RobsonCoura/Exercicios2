package br.com.generation.Algoritimos;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Double custoFabrica, custoConsumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o valor de fábrica deste carro? ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		System.out.println("O custo deste carro ao consumidor é " + custoConsumidor);
		
		leia.close();
		
	}

}
