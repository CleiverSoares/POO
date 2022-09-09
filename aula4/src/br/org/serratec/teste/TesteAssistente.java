package br.org.serratec.teste;

import br.org.serratec.model.Assistente;

public class TesteAssistente {

	public static void main(String[] args) {
		Assistente assistente = new Assistente("321", "Paulo", 5000., "TI");
		assistente.aumentarSalario();
		System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.getSalario());

	}

}
