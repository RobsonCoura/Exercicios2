package br.com.generation.Exercicios;

public class Exe01clienteTeste {

	public static void main(String[] args) {
		
		Exe01cliente c1 = new Exe01cliente(); 
				c1.setNome("Robson");
				c1.setIdade(28);
				c1.setSexo("M");
				
				System.out.println("O nome do cliente é: " + c1.getNome());
				System.out.println("A idade do cliente é: " + c1.getIdade());
				System.out.println("O sexo do cliente é: " + c1.getSexo());
				
				c1.cadastroCliente();
				c1.acessoCliente();
				c1.deslogandoCliente();
			
	}

}
