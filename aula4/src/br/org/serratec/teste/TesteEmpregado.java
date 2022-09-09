package br.org.serratec.teste;

import br.org.serratec.model.Empregado;
import br.org.serratec.model.Programador;
import br.org.serratec.model.Tecnico;

public class TesteEmpregado {

	public static void main(String[] args) {  
		
		//Empregado empregado = new Empregado("jorge", "Jorge@gmail.com", 55.);
		Tecnico tecnico  = new Tecnico("jorge", "Jorge@gmail.com", 55.);
		Programador programador = new Programador("julia","j@gmail.com", 6200.,"python");
		
		Empregado empregado = tecnico;
		empregado = programador;
				
		System.out.println(tecnico);

	}

}
