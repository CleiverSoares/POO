package br.edu.senai.Teste;

import br.edu.senai.Model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		 Empregado e1 = new Empregado("2115", "Cleiver");
		 Empregado e2 = new Empregado("2115", "Cleiver");
		 System.out.println(e1);
		 System.out.println(e2);
		 
		 if(e1.equals(e2)) {
			 System.out.println("Iguais! ");
		 }else {
			 System.out.println("Diferentes! ");
		 }
		 if(e1.getNome().equals(e2)) {
			 System.out.println(" Nomes iguais! ");
			 
		 }
			 
		 
	}

}
