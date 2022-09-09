package br.edu.senai.teste;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno("Joel", 8.5, 8.7));
		alunos.add(new Aluno("DEby", 8.5, 8.7));
		alunos.add(new Aluno("Lucas", 9.0, 8.7));
		alunos.add(new Aluno("Thamires", 8.5, 8.7));
		alunos.add(new Aluno("Debo", 8.5, 8.7));

		for (Aluno aluno : alunos) {

			System.out.println(aluno + " - Média das notas " + aluno.calcularMedia());
			System.out.println("\n -----------------------------------------------------------");

		}

	}

}
