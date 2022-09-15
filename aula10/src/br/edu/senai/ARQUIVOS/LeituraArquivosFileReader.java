package br.edu.senai.ARQUIVOS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivosFileReader {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(new FileReader("/exemplos/leitura.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {

			System.out.println("Arquivo nao encontrado");
		}

	}

}
