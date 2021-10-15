package br.com.generation.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCollections {

	public static void main(String[] args) {
		
		
		String aula1 = "B Bloco I - Java Puro";
		String aula2 = "D Bloco II - Misturado com SpringBoot";
		String aula3 = "A Bloco III - FrontEnd";
		String aula4 = "C Bloco IV - Java Mobile";
		
		List<String> aulas = new ArrayList<>(); // --> [0]
		
		aulas.add(aula1);//--> [0]
		aulas.add(aula2);//-->[1]
		aulas.add(aula3);//-->[2]
		aulas.add(aula4);//-->[3]
		
		/*String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);*/
		
		for(int i =0; i < aulas.size(); i++) {
			System.out.println( (i+1) + "º Aulas: " + aulas.get(i));
		}
			
		
		Collections.sort(aulas);
		System.out.println(aulas);
			
		//System.out.println(aulas.get(2));
		
		
		/*System.out.println(aulas);
		System.out.println(aulas.size());
		
		aulas.remove(1);
		
		System.out.println(aulas);
		System.out.println(aulas.size());*/
		
		// For Each --> Laço repetição "Por cada", laço mais moderninho...
		
		/*for(String i : aulas) {
			System.out.println(i);
		}*/
		
		
		
	}

}
