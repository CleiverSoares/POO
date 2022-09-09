package br.edu.senai.model;

import br.edu.senai.model.enums.EstadoCivil;


public class Pessoa {
	private String nome;
	private String telefone;
	private EstadoCivil estadoCivil;
	private Setor setor;

	public Pessoa(String nome, String telefone, EstadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.setor = setor;

	}

	@Override
	public String toString() {
		return "Nome: ||" + nome + " Telefone: || " + telefone + " EstadoCivil: " + estadoCivil + " ||Setor: " +setor;
	}

	public Setor getSetor() {
		return setor;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

}
