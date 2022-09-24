package br.edu.senai.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Fornecedor;

public class ExemplosSerializable {

	public static void main(String[] args) {
		List<Fornecedor> leituraFornecedores = new ArrayList<>();
		List<Fornecedor> gravacaoFornecedores = new ArrayList<>();

		Fornecedor fornecedor1 = new Fornecedor("123232323", "ABC123 LTDA", "abc@abc.com");
		Fornecedor fornecedor2 = new Fornecedor("2343434", "XPTO LTDA", "xpto@gmail.com");
		Fornecedor fornecedor3 = new Fornecedor("4345454", "TDA S/A", "tda@tda.com");

		gravacaoFornecedores.add(fornecedor1);
		gravacaoFornecedores.add(fornecedor2);
		gravacaoFornecedores.add(fornecedor3);

		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED_BACKGROUND = "\u001B[41m";
		System.out.println(ANSI_RED_BACKGROUND + 
				"---------- Gravar os objetos em disco! ----------" + ANSI_RESET);

		try {
			FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedores.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(gravacaoFornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.flush();
			arquivoGravar.close();
			final String ANSI_RESET1 = "\u001B[0m";
			final String ANSI_RED_BACKGROUND1 = "\u001B[41m";
			System.out.println(ANSI_RED_BACKGROUND1 + 
					"---------- Objeto gravado com sucesso! ----------" + ANSI_RESET1);
			

		} catch (Exception e) {
			System.out.println("Erro !");
			e.printStackTrace();			}
		final String ANSI_RESET1 = "\u001B[0m";
		final String ANSI_RED_BACKGROUND1 = "\u001B[41m";
		System.out.println(ANSI_RED_BACKGROUND1 + "---------- Recuperando arquivos!  ----------" + ANSI_RESET1);
		try {
			FileInputStream arquivoLeitura = new FileInputStream("/Exemplos/fornecedores.dat");
			ObjectInputStream leituraObjeto = new ObjectInputStream(arquivoLeitura);
			leituraFornecedores = (ArrayList<Fornecedor>) leituraObjeto.readObject();
			leituraObjeto.close();
			arquivoLeitura.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		final String ANSI_RESET11 = "\u001B[0m";
		final String ANSI_RED_BACKGROUND11 = "\u001B[41m";
		System.out.println(ANSI_RED_BACKGROUND11 + leituraFornecedores + ANSI_RESET11);

	}

}
