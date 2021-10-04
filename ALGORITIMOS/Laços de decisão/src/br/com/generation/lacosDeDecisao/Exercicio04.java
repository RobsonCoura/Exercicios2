package br.com.generation.lacosDeDecisao;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
		
		if(numero % 2 ==0) {
			
			JOptionPane.showMessageDialog(null, "A raiz quadrada é: " + Math.sqrt(numero), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "A potencia é: " + Math.pow(numero, 2) ,"Mensagem", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
}
