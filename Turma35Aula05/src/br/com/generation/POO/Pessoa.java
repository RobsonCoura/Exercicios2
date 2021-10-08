package br.com.generation.POO;

public class Pessoa {//Criação da Classe ---> Pessoa
	
	//Criação dos Atributos --> do tipo private pata ninguem ter acesso
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
	
	//Criação do Metodo para retornar o nome da pessoa
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
