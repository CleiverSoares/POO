package br.org.senai.model;

public class Aluno implements Comparable<Aluno> {

	private String nome, email;
	private Integer idade;

	public Aluno(String nome, String email, Integer idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno nome=" + nome + "| email=" + email + "| idade=" + idade;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Aluno o) {

		return o.getIdade() - idade;
	}

}
