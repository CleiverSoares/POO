package model;

import java.util.List;

public class Time {
	private String nomeTime, tecnico, diretor;
	private List<Atleta> atletas ;
	
	public Time(String nomeTime, String tecnico, String diretor, List<Atleta> atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return  "Nome do Time: (" + nomeTime + ") \nNome dos atletas: " + atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}
	public String getTecnico() {
		return tecnico;
	}
	public String getDiretor() {
		return diretor;
	}
	public List<Atleta> getAtleta() {
		return atletas;
	}


}
