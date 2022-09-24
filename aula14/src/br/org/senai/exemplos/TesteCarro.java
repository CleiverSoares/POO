package br.org.senai.exemplos;

import java.util.Optional;

import br.org.senai.model.Carro;
import br.org.senai.model.Seguro;

public class TesteCarro {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("total", 3000.);
		Carro carro1 = new Carro("vW", "Gol", Optional.of(seguro));
		Carro carro2 = new Carro("fiat", "palio", Optional.ofNullable(null));
		
		
		System.out.println(carro1);

		if (!carro2.getSeguro().isPresent()) {
			;
			System.out.println(carro2);

		}
	}
}
