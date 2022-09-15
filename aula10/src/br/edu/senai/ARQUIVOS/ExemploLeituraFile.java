package br.edu.senai.ARQUIVOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraFile {

	public static void main(String[] args) {

		try {
			File arquivo = new File("/exemplos/leitura.txt");
			Scanner sc = new Scanner(arquivo);
			sc.useDelimiter(";");
				
			
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}

		} catch (FileNotFoundException e) {

			System.out.println("não encontrado! ");
		}

	}

}
