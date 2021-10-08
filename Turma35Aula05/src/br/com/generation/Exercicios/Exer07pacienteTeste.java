package br.com.generation.Exercicios;

public class Exer07pacienteTeste {

	public static void main(String[] args) {
		
		Exer07paciente c1 = new Exer07paciente();
		
		c1.setNome("Robson");
		c1.setIdade(28);
		c1.setCarterinhaDoConvenio("Amil-234562315-2");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Convenio medico: " + c1.getCarterinhaDoConvenio());
		
		
		c1.pegueSuaSenha();
		System.out.println();
		c1.verifiqueSuaSenha();

	}

}
