package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Assistente a = new Assistente("123","Cleiver",3000.,100.);
		Gerente g = new Gerente("365", "MAria", 4500., " financeiro");
		Diretor d = new Diretor("4545","Joelma", 9500., " Ceo");
		
		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(d);
	}

}
