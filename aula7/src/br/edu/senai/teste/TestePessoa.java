

package br.edu.senai.teste;



import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;
import br.edu.senai.model.enums.EstadoCivil;

public class TestePessoa {

	public static void main(String[] args) {
		Setor setor1 = new Setor(456, "RH");
		Setor setor2 = new Setor(789, "DP");
		
		Pessoa pessoa1 = new Pessoa("Paulo", "98742515", EstadoCivil.CASADO, setor1);
		Pessoa pessoa2 = new Pessoa("Guilherme", "98745785", EstadoCivil.DIVORCIADO, setor2);
		
		System.out.println("Dados pessoais: \n" + pessoa1);
		
		for (EstadoCivil situacao : EstadoCivil.values()) {
			System.out.println(situacao);
			
		}
			
		}
		

	}
