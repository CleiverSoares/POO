package br.org.serratec.teste;

import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto",5000.,"Financeiro");
		gerente.aumentarSalario();
		System.out.println("Dados: "+ gerente.getNome()+ "\n" + gerente.getSalario()) ;
		
		
	}

}
