package br.com.generation.polimorfismo03;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		
		fisica.setNome("Juliana");
		fisica.setCpf(1234567890);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(7894561230L);
		
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
