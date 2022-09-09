package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;

public class AtletaTeste {

	public static void main(String[] args) {
	AtletaAmador  amador = new AtletaAmador("Cleiver", "Masculino",18 , 1.73, true);
	if (amador.podeCompetir()) {
		System.out.println(amador + " Pode competir");
	} else {
		System.out.println(amador + " Não pode competir");
	}
	}
	
	
}

	


