package br.com.generationExercicios;

import java.util.Scanner;

//1.Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 
//de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double [] pontuacao = new Double [5];
		Double maiorPontuacao = 0.0;
		int i;
		
		for(i=0; i<5; i++) {
			System.out.println((i+1) + "� valor: ");
			pontuacao[i] = ler.nextDouble();
		}
		for(i=0; i<5; i++) {
			System.out.println((i+1) + " � valor: " + pontuacao[i]);
			
			if(pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];	
			}	
		}
		System.out.println("A maior pontua��o �: " + maiorPontuacao);
		
	}

}
