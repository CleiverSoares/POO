package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		// Empregado empregado1 = new Empregado("Cleiver", "1665998");
		// Empregado empregado2 = new Empregado("Isabela","15151515");
		Empregado empregados[] = new Empregado[3];
		
		empregados[0]= new Empregado( "Cleiver","22498494994");
		empregados[1]= new Empregado( "caio","233252452656");
		empregados[2]= new Empregado( "jhony","632266363464");
		
		System.out.println(empregados[0]);
		for (Empregado empregado : empregados) {
			System.out.println(empregado  );
		
		
		
			
		}
		
	}

}
