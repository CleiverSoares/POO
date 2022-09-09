package br.edu.senai.teste;

import br.edu.senai.model.enums.Curso;
import br.edu.senai.model.enums.PeriodoCurso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("java", PeriodoCurso.INTEGRAL);
		System.out.println("Nome do curso: " + curso.getNome());
		System.out.println(curso.toString());
		

	}

}
