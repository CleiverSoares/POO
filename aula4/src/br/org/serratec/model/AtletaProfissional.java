package br.org.serratec.model;

public class AtletaProfissional extends Maratona {
	protected Double peso;

	
	
	@Override
	public String toString() {
		return "AtletaProfissional [peso=" + peso + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade
				+ ", altura=" + altura + "]";
	}

	public AtletaProfissional(String nome, String sexo, Integer idde, Double altura, Double peso) {
		super(nome, sexo, idde, altura);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}
	

}
