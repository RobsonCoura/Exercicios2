package br.com.generationExercicios;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class Exercicio04 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int linha, coluna, somaTotal =0, somaDiagonal=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (linha =0; linha<3;linha++){
			for(coluna = 0; coluna < 3; coluna++){
				System.out.printf("Posição: [ " +linha+ " ][ " +coluna+ " ]: " );
				matriz[linha][coluna]= entrada.nextInt();
				}
		}
	
		for (linha =0; linha<3;linha++){
			for(coluna = 0; coluna < 3; coluna++){
				somaTotal += matriz[linha][coluna];
				if (linha == coluna){
				somaDiagonal += matriz[linha][coluna];
				}
			}
		}		
		
		for (linha = 0; linha< 3; linha++){
			for (coluna = 0; coluna < 3; coluna++){	
			System.out.printf("[ "+ matriz[linha][coluna] + " ]");
			}
			System.out.println();
		}
		System.out.println("\nA soma total é: " +somaTotal);
		System.out.println("A soma da diagonal é: " +somaDiagonal);
		
	}
}