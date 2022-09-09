package BR.ORG.SERRATEC.TESTE;

import BR.ORG.SERRATEC.CAUCULOS.CalcularMedia;

public class TesteDivisao {

	public static void main(String[] args) {
		try {
			System.out.println(CalcularMedia.calcular(10, 0));

		} catch (ArithmeticException e) {

			System.out.println("Erro! Divisão por zero! Verifique seu código!");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre é executado independente se cair ou nao no cath");
		}

	}

}
