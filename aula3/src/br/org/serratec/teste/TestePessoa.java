package br.org.serratec.teste;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa ();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Ricardo");
		pessoa1.setPeso(55.5);
		pessoa1.setAltura(1.62);
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2,"maria", 80.1,1.75);
		
		Pessoa pessoa3 = new Pessoa();
	
		System.out.println("Sua situação é: " + pessoa1.resultadoIMC());
		System.out.println("sua situação é: " + pessoa2.resultadoIMC());
		

	}

}
