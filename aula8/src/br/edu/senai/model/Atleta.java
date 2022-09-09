package br.edu.senai.model;

public class Atleta {
	private String nome, posicao;
	private int idade;

	public Atleta(String nome, String posicao, int idade) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
	}

	
	
	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", posicao=" + posicao + ", idade=" + idade + "]";
	}


	public String getNome() {
		return nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public int getIdade() {
		return idade;
	}

}
