package teste;

import Model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		System.out.println("-----------------");
		Conta conta1 = new Conta();
		conta1.numeroConta=1234;
		conta1.titular = "Ana Maria";
		conta1.saldo=1000;
		
		Conta conta2 = new Conta ();
		conta2.numeroConta = 234;
		conta2.titular = "joão";
		conta2.saldo = 5000;
		
		// Deposito de 500,0
		conta1.deposito(500);
		conta2.deposito(130.5);
		// Saque de 200,00
		if (conta1.saque(200)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Não tem dinheiro");
		}
		
		//Imprimir o saldo
		System.out.println("saldo de Ana Maria:" + conta1.saldo);
		System.out.println("saldo de João:" + conta2.saldo);

	}

}
