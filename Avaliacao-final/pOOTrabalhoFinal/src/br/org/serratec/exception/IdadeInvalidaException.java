package br.org.serratec.exception;

public class IdadeInvalidaException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Idade inválida, dependente não pode ter idade maior ou igual a 18";
	}
}