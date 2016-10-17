package br.com.marcio;

import br.com.marcio.model.Usuario;
import br.com.marcio.persistence.UsuarioDAO;

public class TesteUsuario {

	public static void main(String[] args) {
		excluir();
	}

	public static void cadastrar() {
		// Criando o usuario
		Usuario user = new Usuario();
		user.setNome("Marcio Dias");
		user.setLogin("marcio_dias");
		user.setSenha("123456");

		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.cadastrar(user);

		System.out.println("Cadastrado com sucesso!");
	}

	public static void editar() {
		// Criando o usuario
		Usuario user = new Usuario();
		user.setId(3);
		user.setNome("Marcio Dias Dias");
		user.setLogin("marcio_dias");
		user.setSenha("123456");

		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.alterar(user);

		System.out.println("Alterado com sucesso!");
	}
	
	public static void excluir() {
		// Criando o usuario
		Usuario user = new Usuario();
		user.setId(3);

		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.excluir(user);

		System.out.println("Excluido com sucesso!");
	}

}
