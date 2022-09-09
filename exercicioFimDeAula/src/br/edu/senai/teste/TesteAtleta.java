package br.edu.senai.teste;

import java.io.PrintStream;

import br.edu.senai.exercicio.Atleta;
import br.edu.senai.exercicio.Pais;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");
		
		Atleta at1 = new Atleta("Anderson", 98., p1);		
		Atleta at2 = new Atleta("Jon jones", 59., p2);
		Atleta at3 = new Atleta("Vitor Belfor", 110.,p1);
		
		
		System.out.println("O atleta " + at1.getNome()+ at1.verificarSituacao() + 
				" \nO atleta " + at2.getNome()+ at2.verificarSituacao()+ " \nO atleta " 
				+  at3.getNome() + at3.verificarSituacao());
		
		System.out.println(Atleta.getTotalParticipantes());
		
		
		
		

	}

}
