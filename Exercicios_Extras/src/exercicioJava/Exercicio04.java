package exercicioJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Double n1, n2= 0.0, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1º numero: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o 2º numero: ");
		n2 = ler.nextDouble();
		
		soma = (n1 + n2);
		
		System.out.println("A soma total foi: " + soma);
		
		ler.close();
	}

}
