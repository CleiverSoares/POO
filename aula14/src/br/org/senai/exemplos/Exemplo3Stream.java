package br.org.senai.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Stream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10, 100, 200, 400, 900, 120, 40);

		// Imprimir lista com incremento de 10 para todos valores.
//
//		numeros.stream().map(t -> t + 10).forEach(t -> System.out.println(t));
//		
//		System.out.println("----------------------------------");
//		List<String>numeros2 =  Arrays.asList("30","500","180","100","200","80");
//		numeros2.stream().map(n-> new Double(n)).forEach(n->System.out.println(n));
//		System.out.println((numeros2.stream().map(n-> new Double(n)).count()));
//
//		numeros.stream().skip(2).forEach(n -> System.out.println(n));
//		numeros.stream().limit(3).forEach(n -> System.out.println(n));
//		numeros.stream().distinct().forEach(n -> System.out.println(n));
		numeros.stream().distinct().sorted().forEach(n -> System.out.println(n));
	}

}
