package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("Amarelo", "verde", "Azul");

		System.out.println(cores);

		if (cores.isEmpty()) {
			System.out.println(" A lista está vazia! ");

		} else {
			System.out.println(cores);
		}
		System.out.println("A lista contem a cor verde ? " + (cores.contains("verde") ? "sim" : "não"));

		List<String> meses = List.of("jan", "fev", "mar");
		System.out.println(meses);

	}
}
