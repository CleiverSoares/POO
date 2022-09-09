package br.org.serratec.teste;

import br.org.serratec.model.Veiculo;


public class TesteVeiculo {
	public static void main(String[] args) {
		Veiculo  veiculo = new Veiculo();
		veiculo.setPlaca("ABC-1234");
		veiculo.setTipoCombustivel("flex");
		veiculo.setValor(40000.);
		
		System.out.println("O valor do IPVA é:" + veiculo.caucularIPVA());
	}

}
