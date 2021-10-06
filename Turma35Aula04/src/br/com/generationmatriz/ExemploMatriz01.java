package br.com.generationmatriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
	 
		
		double[][] notasAlunos = new double[3][4];  
		
		notasAlunos[0][0] = 8.5;
		notasAlunos[0][1] = 9.6;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 5.3;

		notasAlunos[1][0] = 5.8;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 10.0;
		notasAlunos[1][3] = 3.5;
		
		notasAlunos[2][0] = 5.8;
		notasAlunos[2][1] = 6.9;
		notasAlunos[2][2] = 10.0;
		notasAlunos[2][3] = 3.5;
		
		System.out.println("//****Impressão da Matriz****\\");
		
		for(int linha = 0; linha < notasAlunos.length; linha++) {
			for(int coluna =0; coluna < notasAlunos[linha].length; coluna++ ) {
				
				System.out.print(notasAlunos[linha][coluna] + "|");
			}
			System.out.println();
		}
	}

}
