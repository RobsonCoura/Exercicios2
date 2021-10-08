package br.com.generation.POO;

public class Nome {
		
		//Criação do main para poder executar 
		public static void main(String[] args) {
			// Criar(Instanciar) uma nova pessoa do tipo Objeto
			Pessoa pessoa1 = new Pessoa("Maria","Antonia","Oliveira");
			System.out.println(pessoa1.getNomeCompleto());//Imprimir o nome pessoa
		}
}
