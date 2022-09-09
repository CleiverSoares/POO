package br.edu.senai.teste;

import br.edu.senai.control.ControleDePagamento;
import br.edu.senai.model.Anestesista;
import br.edu.senai.model.Clinica;
import br.edu.senai.model.Medico;

public class TestePlano {

	public static void main(String[] args) {
	
		Clinica clinica = new Clinica(" hcto", " cuidando", " 26546464464");
		Medico medico = new Medico("Hcto", 23555, " GabiGol");
		Anestesista anestesista = new Anestesista(" hcto", 23555, " GabiGoordo", " da Salvação");
		ControleDePagamento cp = new ControleDePagamento();

		clinica.caucularPagamento();
		cp.calcularTotalPago(clinica);

		medico.caucularPagamento();
		cp.calcularTotalPago(medico);

		anestesista.caucularPagamento();
		cp.calcularTotalPago(anestesista);
		
		

		System.out.println(clinica + " Valor a receber do plano " + clinica.getValorPago());
		System.out.println(medico + " Valor a receber do plano " + medico.getValorPago());
		System.out.println(anestesista + " Valor a receber do plano " + anestesista.getValorPago());
		System.out.println("O total das consultas é : " + cp.getTotalGeral());
		

	}

}
