package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>("Hello !");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("joao", "j@gmail.com", 2600.));
		System.out.println(mg2);

		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(
				new Diretor("MArcos", "M@gmail.com", 9000., "Ceo"));
System.out.println(mg4);

	}

}
