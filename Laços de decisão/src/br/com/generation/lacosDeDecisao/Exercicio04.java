package br.com.generation.lacosDeDecisao;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero inteiro:"));
		
		if(numero % 2 ==0) {
			
			JOptionPane.showMessageDialog(null, "A raiz quadrada �: " + Math.sqrt(numero), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "A potencia �: " + Math.pow(numero, 2) ,"Mensagem", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
}
