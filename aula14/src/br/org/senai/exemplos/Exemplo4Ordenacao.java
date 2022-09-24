package br.org.senai.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.org.senai.model.Aluno;

public class Exemplo4Ordenacao {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Mariana", "mari@hotmail.com", 55);
		Aluno aluno2 = new Aluno("Maria", "maria@hotmail.com", 15);
		Aluno aluno3 = new Aluno("Adriana", "a@gmail.com", 32);
		Aluno aluno4 = new Aluno("Oscar", "oscar@hotmail.com", 33);
		Aluno aluno5 = new Aluno("Sergio", "sergio@gmail.com", 81);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
		System.out.println("\n-------------------- Ordenando pela idade antes java 8\n");
		alunos.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println("\n-------------------- Ordenando pela idade apósjava 8\n");
		Comparator<Aluno> ordenarPeloNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
		Collections.sort(alunos, ordenarPeloNome);
		alunos.forEach(a -> System.out.println(a));

		System.out.println("\n------------- Ordenar por email java 8\n");
		alunos.sort((o1, o2) -> o1.getEmail().compareTo(o2.getEmail()));
		alunos.forEach(a -> System.out.println(a));

	}
}