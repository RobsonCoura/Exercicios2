package aaa;

import java.util.Scanner;

public class aa2 {

	public static void main(String[] args) {
		
		
			

			Scanner leia = new Scanner(System.in);
			
			
			int Anos, Meses, Dias, idade;
			
			System.out.println("Quantos anos voc� tem? ");
			Anos = leia.nextInt();
			
			System.out.println("Quantos meses voc� tem? ");
			Meses = leia.nextInt();
			
			System.out.println("Quantos dias voc� tem? ");
			Dias = leia.nextInt();
			
			
			idade = (Anos * 365) + (Meses * 30) + Dias;
			
			System.out.println("Voc� tem " + idade + " dias de vida! ");
		
			leia.close();
			

	
	}
}
