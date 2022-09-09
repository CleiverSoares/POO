package BR.ORG.SERRATEC.TESTE;

import BR.ORG.SERRATEC.MODEL.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Poupanca po = new Poupanca("Eu mesmo", 1000.);

		try {
			po.saque(20000.);
			po.deposito(0.);

		} catch (Exception e) {
			System.out.println(po + " || ou seja: " + e.getMessage());
		}

	}

}
