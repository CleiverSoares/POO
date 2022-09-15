package br.org.serratec.data;

import java.util.Calendar;

public  class  ExemploCalendar {

	public static void main(String[] args) {
		Calendar dataAtual = new Calendar.getInstance();
		System.out.println(dataAtual);
		System.out.println(dataAtual.get(Calendar.DAY_OF_MONTH));
		System.out.println(dataAtual.get(Calendar.HOUR));
		

	}

}
