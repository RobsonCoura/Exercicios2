package br.com.generation.Exercicios;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica p = new Preguica();
		
		
		c.setNome("Dubi");
		c.setIdade(4);
		
		ca.setNome("Poseidon");
		ca.setIdade(5);
		
		p.setNome("Bela");
		p.setIdade(2);
		
		System.out.println("=========================================");
		System.out.println("        Nome do Cachorro: " + c.getNome());
		System.out.println("        Idade: " + c.getIdade() + " anos");
		c.correndo();
		c.deveEmitirSom("  Au! Au!");
		System.out.println("=========================================");
		
		System.out.println("       	 Nome do Cavalo: " + ca.getNome());
		System.out.println("          Idade: " + ca.getIdade() + " anos");
		ca.correndo();
		ca.deveEmitirSom(" Rilinchin!!");
		System.out.println("=========================================");
		System.out.println("         Nome da Preguiça: " + p.getNome());
		System.out.println("         Idade: " + p.getIdade() + " anos");
		p.deveSubirEmArvores();
		ca.deveEmitirSom(" Aaaaa!!");
		System.out.println("=========================================");
		
	}

}
