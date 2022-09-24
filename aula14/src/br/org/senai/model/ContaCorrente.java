package br.org.senai.model;

import br.org.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transação ok! ");

	}

	@Override
	public void investimento() {
		System.out.println("Investimento ok! ");
	}
}
