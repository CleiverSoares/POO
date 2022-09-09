package teste;

import Model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("-------------");
		//instancia de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "calos";
		aluno1.email = "carlos@gmail.com";
				
		System.out.println(aluno1.matricula + "-"+ aluno1.nome +"-"+aluno1.email);		
				
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		System.out.println("aluno1:" + aluno1);
		System.out.println("aluno2:" + aluno2);
		if (aluno1==aluno2) {
			System.out.println("objetos iguais");
		}else {
			System.out.println("Objetos diferentes");
		}
		
		
	}

}
