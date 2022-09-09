package BR.ORG.SERRATEC.CAUCULOS;

public class CalcularMedia {

	/*
	 * public static int calcular(int num1, int num2) { if (num2 == 0) { throw new
	 * ArithmeticException("\n\nVocê digitou zero no segundo parâmetro!\n\n");
	 * 
	 * } return num1 / num2;
	 */

	// }

	// throws - o erro não sera tratado no metodo e sim na classe que chamar esse
	// metodo
	public static int calcular(int num1, int num2) throws ArithmeticException {
		return num1 / num2;
	}
}
