package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimentos;

	@Override
	public Double caucularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPF;

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}

	public String getNome() {
		return nome;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	@Override
	public Double calcularICMS() {
		return 0.0;
	}

}
