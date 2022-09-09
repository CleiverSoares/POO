package exercicios;

public class Fatoria1ao10 {

	public static void main(String[] args) {
		int atual = 1, fatorial = 1, i = 10;
		
     for ( i = 1; i <= 10 ; i++) {

        	
     
    	   
       if(atual <=i )

	
		fatorial = fatorial * atual;
		atual = i - 1;
		System.out.println(fatorial);
	}
	
}}
