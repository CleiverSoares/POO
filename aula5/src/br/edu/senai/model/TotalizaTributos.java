package br.edu.senai.model;
//import br.org.serratec.model.Tributacao;

public class TotalizaTributos {
	private Double total = 0.0;

	public Double getTotal() {
		return total;

	}

	public void totalGeralTributos(Tributacao t) {
		total += t.
		total += t.calcularImpostoDeRenda();

	}

}
