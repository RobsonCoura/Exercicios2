package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, sobraHoras, tempo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu tempo em segundos! ");
		tempo = leia.nextInt();
		
		horas = (tempo / 3600);
		sobraHoras = (tempo % 3600);
		minutos = (sobraHoras / 60);
		segundos = (sobraHoras % 60);
		
		System.out.println("Seu tempo em horas é: " + horas + " hora " + minutos + " minutos " 
		+ segundos + " segundos ");
		
		leia.close();

	}

}
