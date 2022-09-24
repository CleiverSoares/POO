package br.org.senai.interfaces;

public interface Conta {
	public void transacao();
	// para interface ser funcional, ele só pode ter um metodo abstrato.

	// Método default - são métodos que comtém implementação dentro das classes.

	default void investimento() {
		System.out.println("Você aplicou em um fundo de investimentos! ");
	}

}
