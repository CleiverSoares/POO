package br.edu.senai.setor;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
		vetor[0] = "Roni";
		System.out.println(vetor[0]);

		// String meses = new String[] {"Janeiro","Fevereiro","Março"};

		String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun" };
		System.out.println(meses[2]); // se eu quiser escolher um item em especial.

		for (String mes : meses) { // se eu quiser todos os valores do vetor.
			System.out.println(mes);
		}

	}

}
