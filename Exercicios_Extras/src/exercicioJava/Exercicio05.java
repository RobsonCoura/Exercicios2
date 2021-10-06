package exercicioJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Double n1, n2, resultado= 0.0;
		char operador;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1º numero: ");
		n1 = ler.nextDouble();
		
		System.out.println("Qual operação matemática?");
		operador = ler.next().charAt(0);
		
		System.out.println("Digite o 2º numero: ");
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
			System.out.println("Operação invalida: ");
		}
		System.out.println("O valor total é: " + resultado);
		
		ler.close();
		
		}
		
	}


