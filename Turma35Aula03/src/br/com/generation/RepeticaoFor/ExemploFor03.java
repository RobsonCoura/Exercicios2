package br.com.generation.RepeticaoFor;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 0, desce = 9; sobe <= 9 && desce >= 0; sobe++, desce --) {
			
			System.out.print("\n" + sobe + " | " + desce);
			Thread.sleep(1000);
		}
	}

}
