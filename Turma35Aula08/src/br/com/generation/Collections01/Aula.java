package br.com.generation.Collections01;

public class Aula {
	
	private String t�tulo;
	private int tempo;
	
	
	public Aula(String t�tulo, int tempo) {
		super();
		this.t�tulo = t�tulo;
		this.tempo = tempo;
	}
	public String getT�tulo() {
		return t�tulo;
	}
	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return "\nAula: " + this.t�tulo + " | " + this.tempo + " minutos";
	}

}
