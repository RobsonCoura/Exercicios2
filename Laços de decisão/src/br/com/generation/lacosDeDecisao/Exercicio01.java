package br.com.generation.lacosDeDecisao;

/*1-	Faça um programa que receba três inteiros e diga qual deles é o maior.*/



import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Integer n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1ª inteiro:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º inteiro:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 3º número inteiro:"));
			
	/**/	if(n1 > n2 && n1>n3 ) {
		JOptionPane.showMessageDialog(null, "O maior numero é: "+ n1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
			}
	
				else if (n2>n1 && n2>n3) {
					JOptionPane.showMessageDialog(null, "O maior numero é: " + n2, "Erro", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
			}
				else {
					JOptionPane.showMessageDialog(null, "O maior numero é: " + n3, "Erro", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			
	}

	}
