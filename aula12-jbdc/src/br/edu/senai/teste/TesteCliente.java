package br.edu.senai.teste;

import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(12, "Robertonei", "65656565", "Rigonui@gmail.com");
		ClienteDao clienteDao = new ClienteDao();

		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		//for (Cliente c : clienteDao.listarClientes()) {
		//	System.out.println( c);
			
		//}
		System.out.println(clienteDao.listarClientes("Ro"));

	}

}
