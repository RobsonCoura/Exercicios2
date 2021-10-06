package br.com.generation.RepeticaoWhile;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) {/// --> inicio do laçp de repetição -while
			System.out.println("Dgite um número: ");
			numero = in.nextInt();
			
			if(numero == 10) {// --> inicio do laço condicional
				System.out.println("Você acertou!!!");
			}
			else {// Fim do laço de repetição
				System.out.println("Você errou!!");
			}// --> Fim do laço de repetição - while
		}
	}

}
