package br.edu.senai.teste;

import br.edu.senai.model.Tv;
import br.edu.senai.model.enums.MarcaTv;
//import br.edu.senai.model.enums.Marca.Tv;

public class TesteTV {

	public static void main(String[] args) {
	Tv tv = new Tv("mn-123", 43.,MarcaTv.AOC);
	
	
			System.out.println(tv);
			
	}

}
