package br.com.generation.lacosDeDecisao;

/*1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/



import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Integer n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1� inteiro:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2� inteiro:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 3� n�mero inteiro:"));
			
	/**/	if(n1 > n2 && n1>n3 ) {
		JOptionPane.showMessageDialog(null, "O maior numero �: "+ n1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
			}
	
				else if (n2>n1 && n2>n3) {
					JOptionPane.showMessageDialog(null, "O maior numero �: " + n2, "Erro", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
			}
				else {
					JOptionPane.showMessageDialog(null, "O maior numero �: " + n3, "Erro", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			
	}

	}
