package br.org.senai.exemplos;

import br.org.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = () -> System.out.println("Transação efetuada! ");
		conta.transacao();
		Conta conta2 = () -> System.out.println("Transação efetuada conta2");
		conta2.transacao();
	}

}
