package br.org.serratec.model;

public class Empresa implements Tributacao {
	private String razaoSocial;
	private Double rendimentos;



	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}
	

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}


	public Double getRendimentos() {
		return rendimentos;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public Double caucularImpostoDeRenda() {
		// TODO Auto-generated method stub
		return rendimentos * impostoDeRendaPJ;
	}

	@Override
	public Double calcularICMS() {
		// TODO Auto-generated method stub
		return rendimentos* icms;
	}

}
