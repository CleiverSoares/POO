package teste;

import java.util.ArrayList;
import java.util.List;

import model.Atleta;
import model.Time;

public class TesteTime {

	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<>();
		atletas.add(new Atleta("joão", 20, "Atacante"));
		atletas.add(new Atleta("julio", 30, "meio_campo"));
		atletas.add(new Atleta("Pedro", 26, "Lateral"));
		atletas.add(new Atleta("Bruno Henrique", 23, "Zagueiro"));
		atletas.add(new Atleta("Gabi gol", 32, "Goleiro"));
		
		
		Time t = new Time("Flamengo","Doriva Júnior", "Marcos Brás", atletas);

		

 System.out.println(t);
	}

}
