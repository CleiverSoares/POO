package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "Ana@gmail.com", 4884.);
		Funcionario f2 = new Funcionario("Aninha", "Aninha@gmail.com", 3084.);
		Funcionario f3 = new Funcionario("Anona", "Anona@gmail.com", 9084.);
		Funcionario f4 = new Funcionario("Anosa", "Anosa@gmail.com", 7885.);

		Sorteio<Funcionario> so = new Sorteio<>();
		so.adicionar(f1);
		so.adicionar(f2);
		so.adicionar(f3);
		so.adicionar(f4);

		
		System.out.println( "Quem ganhou o sorteio foi "+ so.sorteio());
	}

}
