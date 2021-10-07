package br.com.generationExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int [][] n1 = new int [2][3];
		int [][] n2 = new int [2][3];
		int [][] m1 = new int [2][3];
		int [][] m2 = new int [2][3];
		
		int linha, coluna;
		System.out.println("Matriz N1");
		for(linha = 0; linha < n1.length; linha++) {
			for(coluna=0; coluna<n1[linha].length;coluna++) {
				System.out.printf("Digite o valor da posição %d %d: ", linha, coluna);
				n1[linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println("\nMatriz N2");
		for(linha = 0; linha <n2.length; linha++) {
			for(coluna=0; coluna<n2[linha].length;coluna++) {
				System.out.printf("Digite o valor da posição %d %d: ", linha, coluna);
				n2[linha][coluna] = ler.nextInt();
			}
		}
		//Calculo da M1
		for(linha = 0; linha <m1.length; linha++) {
			for(coluna=0; coluna<m1[linha].length;coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
			}
		}
		//Calculo da M2
		for(linha = 0; linha <m2.length; linha++) {
			for(coluna=0; coluna<m2[linha].length;coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		}
		System.out.println("Matriz M1");
		for(linha = 0; linha <m1.length; linha++) {
			for(coluna=0; coluna<m1[linha].length;coluna++) {
				System.out.printf(m1[linha][coluna] + " | ");
			}
			System.out.println();
		}
		System.out.println("Matriz M2");
		for(linha = 0; linha <m2.length; linha++) {
			for(coluna=0; coluna<m2[linha].length;coluna++) {
				System.out.printf(m2[linha][coluna] + " | ");
			}
			System.out.println();
		}
	}

}
