package br.com.generationExercicios;

//1-Informar todos os n�meros de 1000 a 1999 que quando divididos 
//por 11 obtemos resto = 5. (FOR)

public class Exercicio01 {

	public static void main(String[] args) {
		
		int x = 1000, divisao =0, resultado =0;
		
		for(; x <= 1999; x++)
		{
			if(x % 11 == 5) {
				System.out.println("Os numeros divididos s�o: " + x);
			}
		}
		
	}

}
