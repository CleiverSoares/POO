package br.edu.senai.model;

// Com o final essa classe não poderá ter filhos.
// Imutável. Math
//public final class Policial

public  class Policial {
	private String nome, matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	// Quando colocar o final no método estamos proibindo a sobreescrita
	public   String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
