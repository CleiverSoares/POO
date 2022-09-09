package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalizaTributos;

public class TesteTributos {

	public static void main(String[] args) {
		Empresa e = new Empresa("ABC", 259000.);
		Pessoa pe = new Pessoa("Cleiver", 8200.);
		TotalizaTributos t = new TotalizaTributos();
		
		

		

		System.out.println(e + " Tributos à pagar: ICMS " + e.calcularICMS() + "IR:" + e.caucularImpostoDeRenda());
		System.out.println(pe + " Tributos à pagar: " + pe.caucularImpostoDeRenda());

		 t.totalGeralTributos(e);
		 t.totalGeralTributos(pe);
		 System.out.println(t.getTotal());
	}

}
