package br.com.generation.RepeticaoWhile;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) {/// --> inicio do la�p de repeti��o -while
			System.out.println("Dgite um n�mero: ");
			numero = in.nextInt();
			
			if(numero == 10) {// --> inicio do la�o condicional
				System.out.println("Voc� acertou!!!");
			}
			else {// Fim do la�o de repeti��o
				System.out.println("Voc� errou!!");
			}// --> Fim do la�o de repeti��o - while
		}
	}

}
