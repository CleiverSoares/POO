package exercicios;

import java.util.Scanner;

public class ExerciciosDados {
	public static void main(String[] args) {
		int i, pesoMax = 0, alturaMax = 0;
		Scanner sc = new Scanner(System.in);
		double peso[] = { 0., 0., 0., 0. }, altura[] = { 0., 0., 0., 0. }, mediaPeso = 0, mediaAltura = 0;
		String nome[] = { "", "", "", "" };

		for (i = 0; i < 4; i++) {
			System.out.println("Escreva o nome: ");
			nome[i] = sc.next();

			System.out.println("Escreva sua altura: ");
			altura[i] = sc.nextDouble();

			System.out.println("Escreva seu peso: ");
			peso[i] = sc.nextDouble();

			if (peso[i] > peso[pesoMax]) {
				pesoMax = i;
				if (altura[i] > altura[alturaMax]) {
					alturaMax = i;
					mediaPeso = mediaPeso + peso[i];
					mediaAltura = mediaAltura + altura[i];

				}
				
			}

		} 
		mediaPeso = mediaPeso / i;
		mediaAltura = mediaAltura / i;
		System.out.println("A pessoa com maior peso é : " + nome[pesoMax] + "\n");
		System.out.println("A Pessoa com maior altura é: " + nome[alturaMax] + "\n");
		System.out.println("A média dos pesos é : " + mediaPeso);
		System.out.println("A média das alturas é : " + mediaAltura);

	}
}

//2) Faça um programa para ler os dados de 4 pessoas contendo nome, peso e altura.

//Calcule e escreva:

//O nome da pessoa com maior peso

//O nome da pessoa com maior altura

//A média de peso

//A média de altura