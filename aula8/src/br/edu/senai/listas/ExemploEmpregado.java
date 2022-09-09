package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		empregados.add(new Empregado("Cleiver", "1541514848"));
		empregados.add(new Empregado("perac", "1541514848"));
		empregados.add(new Empregado("jhonjhonr", "1541514848"));

		for (Empregado empregado : empregados) {
			System.out.println(empregado);

		}

	}

}
