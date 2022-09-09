package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Medico;

public class ExemploMedico {

	public static void main(String[] args) {
	List<Medico> medicos =	new ArrayList<>();
	
	medicos.add(new Medico("154",200.));
	medicos.add(new Medico("144",240.));
	medicos.add(new Medico("124",400.));
	Double maior = 0.0;
	
	for (Medico medico : medicos) {
		if(medico.getValorConsulta()> maior) {
			maior = medico.getValorConsulta();
		}
		System.out.println(medico);
	}
	System.out.println("O valor mais caro é: " + maior);
	}

}
