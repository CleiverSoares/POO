package br.edu.senai.exercicio;

public class Livro {
	private String autor, titulo;
	protected Double valor;

	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "  Autor: " + autor + ", titulo=" + titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void reajuste(double valorReajuste) {
		valor = valor * valorReajuste + 1;
	}

}
