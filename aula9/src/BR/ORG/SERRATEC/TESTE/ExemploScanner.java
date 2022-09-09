package BR.ORG.SERRATEC.TESTE;

import java.util.Scanner;

public class ExemploScanner {

	public static Integer lerDados() {
		Integer num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		num = sc.nextInt();
		sc.close();
		return num;

	}

	public static void main(String[] args) {

		System.out.println("voce digitou: " + lerDados());

	}

}
