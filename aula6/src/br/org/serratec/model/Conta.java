package br.org.serratec.model;

//Uma interface não pode ter instâncias.
//Não posso fazer - Conta conta = new Conta();
// È uma forma de substituir a herança em alguns casos.
//Toda interface é criada para ter somene assinatura.
//Interfaces não tem implementação.

public interface Conta {
	Double taxaBancaria = 2.50;

	// não é necessário colocar o abstract porque fica implícito.
	public Boolean saque(Double valor);

	public Boolean deposito(Double valor);

}
