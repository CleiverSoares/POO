package br.edu.senai.ARQUIVOS;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {

	public static void main(String[] args) {
		try {
			
	
		FileOutputStream gravar = new FileOutputStream("/exemplos/teste.dat");
		DataOutputStream gravarArquivo = new DataOutputStream(gravar);
		gravarArquivo.writeChars("java orientação obj");
		gravarArquivo.close();
		
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado! ");
		}
		

	}

}