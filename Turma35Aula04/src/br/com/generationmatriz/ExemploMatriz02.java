package br.com.generationmatriz;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("****Notas dos Alunos****");
		
		for(int l = 0; l < notasAlunos.length; l++ ) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite �s notas: %d %d: ", l, c);
				notasAlunos[l][c] = ler.nextDouble();//Adicionar
			}
			System.out.println();
		}
		for(int l = 0; l < notasAlunos.length; l++) {//Foi adicionado
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c] + ",");
			}
			System.out.println();
		}

	}

}
