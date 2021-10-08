package br.com.generation.POO;

public class Pessoa {//Cria��o da Classe ---> Pessoa
	
	//Cria��o dos Atributos --> do tipo private pata ninguem ter acesso
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//Construtor --> que tem o mesmo nome da Classe 
	public Pessoa (String primeiro, String meio, String ultimo)//Parametros do construtor associando com os atributos
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	//Cria��o do Metodo para retornar o nome da pessoa
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
