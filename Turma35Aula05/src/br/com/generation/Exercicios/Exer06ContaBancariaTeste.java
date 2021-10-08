package br.com.generation.Exercicios;

public class Exer06ContaBancariaTeste {

	public static void main(String[] args) {
		
		Exer06ContaBancaria c1 = new Exer06ContaBancaria();
		
		c1.setBanco("Itau");
		c1.setAgencia(0146);
		c1.setConta(54789);
		c1.setDigito(5);
		
		

		System.out.println("Banco: " + c1.getBanco());
		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Conta: " + c1.getConta());
		System.out.println("Digito: " + c1.getDigito());
		
		
		c1.sacarDinheiro();
		System.out.println();
		c1.depositarDinheiro();
	}

}
