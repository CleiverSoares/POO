package BR.ORG.SERRATEC.TESTE;

public class TesteString {

	public static void main(String[] args) {
		String texto = null;

		try {
			texto = texto.toLowerCase();
			System.out.println(texto);

		} catch (NullPointerException e) {
			System.out.println("Deu merda");
			e.printStackTrace();
			
		}

	}

}
