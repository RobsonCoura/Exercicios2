package br.com.generationExercicios;

import java.util.Scanner;

//1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
//de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double [] pontuacao = new Double [5];
		Double maiorPontuacao = 0.0;
		int i;
		
		for(i=0; i<5; i++) {
			System.out.println((i+1) + "ª valor: ");
			pontuacao[i] = ler.nextDouble();
		}
		for(i=0; i<5; i++) {
			System.out.println((i+1) + " ª valor: " + pontuacao[i]);
			
			if(pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];	
			}	
		}
		System.out.println("A maior pontuação é: " + maiorPontuacao);
		
	}

}
