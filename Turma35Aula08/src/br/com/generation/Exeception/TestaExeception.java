package br.com.generation.Exeception;

public class TestaExeception {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes do Erro.");
		
		try {
		vetor[4] = 10;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Esse vetor est� com o valor errado na posi��o!");
		System.out.println(e);
	}

}
}