package exercicios;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		Scanner variavel = new Scanner(System.in);
		int multi, resultado;
		System.out.println("Digite um número; ");
		int numero = variavel.nextInt();

		for (multi = 1; multi <= 10; multi++) {
			resultado = multi * numero; 
			System.out.printf("%d x %d = %d\n", numero, multi, resultado);
		}

	}

}
