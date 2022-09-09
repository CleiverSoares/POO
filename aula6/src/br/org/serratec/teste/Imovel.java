package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class Imovel {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("cleiver");
		Casa casa = new Casa("Zona leste", 165000.0, true);
		Apartamento apto = new Apartamento("Zona leste", 45900.0, 2);

		casa.setProprietario(proprietario);
		apto.setProprietario(proprietario);

		System.out.println("Dados do Imovel:" + casa + casa.getProprietario().getNome());
		System.out.println("Dados do Imovel:" + apto + apto.getProprietario().getNome());
	}

}
