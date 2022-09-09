package BR.ORG.SERRATEC.MODEL;

import BR.ORG.SERRATEC.EXCEPTION.ContaException;

public class Poupanca implements Conta {
	private String titular;
	private Double saldo;

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "titular: " + titular + ", saldo: " + saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if (saldo >= valor ) {
			saldo -= valor;
			return true;

		}
		throw new ContaException("Saldo Insuficiente!!! ");
	}

	@Override
	public Boolean deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;

		}
		throw new ContaException("Valor de deposito invalido!!! ");
	}

}
