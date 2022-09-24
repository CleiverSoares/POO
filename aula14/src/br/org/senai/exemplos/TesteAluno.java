package br.org.senai.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.org.senai.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno("jorge", "j@gmail.com", 45),
				new Aluno("Maria", "m@gmail.com", 32));
		// for (Aluno aluno : alunos) {
		// System.out.println(aluno);

		// }
//		// ExibirDadosAluno eda = new ExibirDadosAluno();
//
//		Consumer<Aluno> exibirDadosAluno = new Consumer<Aluno>() {
//
//			@Override
//			public void accept(Aluno t) {
//				System.out.println("-----Dados do Aluno------");
//				System.out.println(t.getNome());
//				System.out.println(t.getEmail());
//				System.out.println(t.getIdade());
//
//			}
//
//		};
//		Consumer<Aluno> exibirDadosAluno = consumer;
//		
//		alunos.forEach(exibirDadosAluno);
		alunos.forEach(t -> {
			System.out.println("------- for each-----");
			System.out.println(t.getNome());
			System.out.println(t.getEmail());
	});
		
	}

}
