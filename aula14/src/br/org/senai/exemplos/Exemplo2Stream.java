package br.org.senai.exemplos;

import java.util.Arrays;

import java.util.List;

import br.org.senai.model.Aluno;

public class Exemplo2Stream {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mariana", "mari@gmail.com", 95);
		Aluno aluno2 = new Aluno("joel", "j@gmail.com", 45);
		Aluno aluno3 = new Aluno("carlos", "c@gmail.com", 25);
		Aluno aluno4 = new Aluno("Murilo", "mu@gmail.com", 15);
		Aluno aluno5 = new Aluno("silvio", "s@gmail.com", 75);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

		alunos.stream().filter(a -> a.getIdade() > 50).forEach(t -> System.out.println(t));
		System.out.println("------ Filtro de idade maior com M");
		System.out.println("----Filtro por Letra que começa com M");
		alunos.stream().filter(a -> a.getNome().startsWith("M")).forEach(t -> System.out.println(t));
	}

}
