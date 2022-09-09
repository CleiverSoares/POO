package exercicios;

import java.util.Scanner;

public class ImprimaInteiro {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int numero, n1,n2;
     System.out.println("Digite um número, e descubra quem é seu sucessor e antecessor: ");
     numero = sc.nextInt();
     n1 = numero - 1;
     n2 = numero + 1;
     
     System.out.println(n1+ " È o antecessor de ("+numero+ ") e "+ n2 + " é o seu sucessor !");
     
     
     


	}

}
