package br.edu.senai.exercicio;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean cadastro;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean cadastro) {
		super(nome, dataVacinacao, raca);
		this.cadastro = cadastro;
	}

	public Boolean getCadastro() {
		return cadastro;
	}

	@Override
	public Boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean alimentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
