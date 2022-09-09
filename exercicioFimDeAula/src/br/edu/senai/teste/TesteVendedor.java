package br.edu.senai.teste;

import java.util.Scanner;

import br.edu.senai.exercicio.FreeLance;
import br.edu.senai.exercicio.fixo;

public class TesteVendedor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		fixo vendedor1 = new fixo("Joana", "153269468555", 2000., 100.);
		FreeLance vendedor2 = new FreeLance("Marta","12645685795",30,50.);
		
		//vendedor1.calcularSalario();
			
		
		System.out.println("--------------Sistema de Vendas-------------");
	}
}
