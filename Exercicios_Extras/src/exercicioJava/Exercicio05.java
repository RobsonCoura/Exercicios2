package exercicioJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Double n1, n2, resultado= 0.0;
		char operador;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1� numero: ");
		n1 = ler.nextDouble();
		
		System.out.println("Qual opera��o matem�tica?");
		operador = ler.next().charAt(0);
		
		System.out.println("Digite o 2� numero: ");
		n2 = ler.nextDouble();
		
		if(operador == '+') {
			resultado = (n1+n2);
		}
		else if(operador == '-') {
			resultado = (n1-n2);
		}
		else if(operador == '*') {
			resultado = (n1*n2);
		}
		else if(operador == '/') {
			resultado = (n1/n2);
		}
		else {
			System.out.println("Opera��o invalida: ");
		}
		System.out.println("O valor total �: " + resultado);
		
		ler.close();
		
		}
		
	}


