package br.edu.senai.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemploset {

	public static void main(String[] args) {
		//Set<String> cores = new HashSet<>();
		Set <String>  cores =  new TreeSet<>();
		
		cores.add("Azul");
		cores.add("Azul");
		cores.add("Vermelhor");
		cores.add("Laranja");
		cores.add("Branco");
		cores.add("Azul");

		System.out.println(cores );
		
	}

}
