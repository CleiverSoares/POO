package br.edu.senai.teste;

import br.edu.senai.exercicio.Livro;
import br.edu.senai.exercicio.Operacao;

public class TesteLivraria {

	public static void main(String[] args) {
		Livro l1 = new Livro("marco antonio", "cisco ccna", 85.);
		Livro l2 = new Livro("kathy Sierra", "use a cabeca java", 90.);

		Operacao o1 = new Operacao("emprestimo", l1);
		Operacao o2 = new Operacao("Valor", l2);

		l1.reajuste(0.06);
		o2.EmprestarLivro();
		o1.venderLivro();

		System.out.println(o1.toString());
		System.out.println(o2.toString());

	}
}
