package br.com.generationvetor;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		
		double[] temp = new double[10];
		
		temp[0] = 32.0;
		temp[1] = 28.3;
		temp[2] = 26.7;
		temp[3] = 31.2;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temp[2]);
		
		//System.out.println("O tamanho do vetor: " + temp.length);
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println("O valor da temperatura do dia: "
						+  (i + 1) + " é: " + temp[i]);
		}
	}

}
