package br.org.serratec.model;

public class AtletaAmador extends Maratona {
	private Boolean atestado;

	public AtletaAmador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	@Override
	public String toString() {
		return "AtletaAmador [atestado=" + (atestado == true ? "sim": "não ")+ ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade
				+ ", altura=" + altura + "]";
	}

	public Boolean getAtestado() {
		return atestado;
	}

}
