package br.edu.senai.teste;

import br.edu.senai.model.Imovel;
import br.edu.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("eu", "Eu@gmail.com");
		Pessoa pessoa2 = new Pessoa("ela", "ela@gmail.com");
		
		Imovel imovel1 = new Imovel("casa", "Centro", 35033., pessoa2);
		
		System.out.println(imovel1.getLocal() +"-"+imovel1.getPessoa().getNome());
	}

}
