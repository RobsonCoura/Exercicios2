package br.com.generation.Collections01;

public class Aula {
	
	private String título;
	private int tempo;
	
	
	public Aula(String título, int tempo) {
		super();
		this.título = título;
		this.tempo = tempo;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return "\nAula: " + this.título + " | " + this.tempo + " minutos";
	}

}
